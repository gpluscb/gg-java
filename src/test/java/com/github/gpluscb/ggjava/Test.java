package com.github.gpluscb.ggjava;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;
import com.github.gpluscb.ggjava.entity.object.response.objects.TournamentResponse;
import com.github.gpluscb.ggjava.internal.json.Deserializer;

import javax.annotation.Nonnull;

public class Test {
	private static final String testQuery = "query TournamentQuery{tournament(slug:\"evo2018\"){events{name standings(query:{page:1,perPage:3}){nodes{standing entrant{name}}}}}}";

	public static void main(@Nonnull String[] args) {
		// rateLimiterTest();
		clientTest(args);
	}

	private static void rateLimiterTest() {
		RateLimiter limiter = RateLimiter.bucketBuilder().build();

		for (int i = 0; i < 200; i++) {
			int i_ = i;

			limiter.enqueue(retries -> {
				System.out.printf("No. %d started: %d", i_ + 1, System.currentTimeMillis());
				System.out.printf(" | finished: %d%n", System.currentTimeMillis());
				return i_ + 1 == 10 || i_ + 1 == 100 && retries < 1; // Only retry request No. 10 and 100 once
			});
		}

		limiter.shutdown();
	}

	private static void clientTest(@Nonnull String[] args) {
		if (args.length == 0) {
			System.out.println("Give token pls");
			return;
		}

		GGClient client = GGClient.builder(args[0]).limiter(RateLimiter.bucketBuilder().period(61000L).tasksPerPeriod(80).build()).build();
/*
		for (int i = 0; i < 100; i++) {
			int i_ = i;
			client.request(testQuery).thenAccept(r -> System.out.println("No. " + (i_ + 1) + " finished at " + System.currentTimeMillis())).exceptionally(t -> {
				t.printStackTrace();
				return null;
			});
		}
*/
		client.request(testQuery).whenComplete((r, t) -> {
			if(t == null) {
				try {
					System.out.println(r);

					TournamentResponse tournament = Deserializer.deserialize(r.getAsJsonObject("data").get("tournament"), TournamentResponse.class);
					System.out.println("tournament: " + tournament);
					if (tournament != null) {
						System.out.println("\tevents: " + tournament.getEvents());
						if (tournament.getEvents() != null) {
							tournament.getEvents().forEach(event -> {
								System.out.println("\t\tevent: " + event);
								if (event != null) {
									System.out.println("\t\t\tname: " + event.getName());
									System.out.println("\t\t\tstandings: " + event.getStandings());
									if (event.getStandings() != null) {
										System.out.println("\t\t\t\tnodes: " + event.getStandings().getNodes());
										if (event.getStandings().getNodes() != null) {
											event.getStandings().getNodes().forEach(node -> {
												System.out.println("\t\t\t\t\tnode: " + node);
												if (node != null) {
													System.out.println("\t\t\t\t\t\tstanding: " + node.getStanding());
													System.out.println("\t\t\t\t\t\t\tentrant: " + node.getEntrant());
													if (node.getEntrant() != null) {
														System.out.println("\t\t\t\t\t\t\t\tname: " + node.getEntrant().getName());
													}
												}
											});
										}
									}
								}
							});
						}
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			} else {
				t.printStackTrace();
			}
		});

		client.shutdown();
	}
}
