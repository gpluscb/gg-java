package com.github.gpluscb.ggjava;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;

import javax.annotation.Nonnull;

public class Test {
	private static final String testQuery = "query TournamentQuery{tournament(slug:\"evo2018\"){e vents{name state standings(query:{page:1,perPage:3}){nodes{placement container{__typename ... on Tournament{name} ... on Event{name} ... on PhaseGroup{displayIdentifier} ... on Set{identifier}} entrant{name}}}}}}";

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
		client.query(testQuery).whenComplete((response, t) -> {
			if (t == null) {
				try {
					response.onError(e -> System.out.println(e.getResponseRoot().toString()))
							.onSuccess(data -> {
								System.out.println("data: " + data);
								if (data != null) {
									System.out.println("\ttournament: " + data.getTournament());
									if (data.getTournament() != null) {
										System.out.println("\t\tevents: " + data.getTournament().getEvents());
										if (data.getTournament().getEvents() != null) {
											data.getTournament().getEvents().forEach(event -> {
												System.out.println("\t\t\tevent: " + event);
												if (event != null) {
													System.out.println("\t\t\t\tname: " + event.getName());
													if (event.getName() != null) {
														System.out.println("\t\t\t\t\tnameString: " + event.getName().getValue());
													}
													System.out.println("\t\t\t\tstate: " + event.getState());
													if (event.getState() != null) {
														System.out.println("\t\t\t\t\tstateEnum: " + event.getState().getValue());
													}
													System.out.println("\t\t\t\tstandings: " + event.getStandings());
													if (event.getStandings() != null) {
														System.out.println("\t\t\t\t\tnodes: " + event.getStandings().getNodes());
														if (event.getStandings().getNodes() != null) {
															event.getStandings().getNodes().forEach(node -> {
																System.out.println("\t\t\t\t\t\tnode: " + node);
																if (node != null) {
																	System.out.println("\t\t\t\t\t\t\tplacement: " + node.getPlacement());
																	if (node.getPlacement() != null) {
																		System.out.println("\t\t\t\t\t\t\t\tplacementInt: " + node.getPlacement().getValue());
																	}
																	System.out.println("\t\t\t\t\t\t\tcontainer: " + node.getContainer());
																	if (node.getContainer() != null) {
																		node.getContainer().onTournament(tournament -> {
																			System.out.println("\t\t\t\t\t\t\t\ttournament: " + tournament);
																			if (tournament != null) {
																				System.out.println("\t\t\t\t\t\t\t\t\t\tname: " + tournament.getName());
																				if (tournament.getName() != null) {
																					System.out.println("\t\t\t\t\t\t\t\t\tnameString: " + tournament.getName().getValue());
																				}
																			}
																		}).onEvent(event_ -> {
																			System.out.println("\t\t\t\t\t\t\t\tevent_: " + event_);
																			if (event_ != null) {
																				System.out.println("\t\t\t\t\t\t\t\t\t\tname: " + event_.getName());
																				if (event_.getName() != null) {
																					System.out.println("\t\t\t\t\t\t\t\t\tnameString: " + event_.getName().getValue());
																				}
																			}
																		}).onPhaseGroup(phaseGroup -> {
																			System.out.println("\t\t\t\t\t\t\t\tphaseGroup: " + phaseGroup);
																			if (phaseGroup != null) {
																				System.out.println("\t\t\t\t\t\t\t\t\t\tname: " + phaseGroup.getDisplayIdentifier());
																				if (phaseGroup.getDisplayIdentifier() != null) {
																					System.out.println("\t\t\t\t\t\t\t\t\tnameString: " + phaseGroup.getDisplayIdentifier().getValue());
																				}
																			}
																		}).onSet(set -> {
																			System.out.println("\t\t\t\t\t\t\t\tset: " + set);
																			if (set != null) {
																				System.out.println("\t\t\t\t\t\t\t\t\t\tname: " + set.getIdentifier());
																				if (set.getIdentifier() != null) {
																					System.out.println("\t\t\t\t\t\t\t\t\tnameString: " + set.getIdentifier().getValue());
																				}
																			}
																		});
																	}
																	System.out.println("\t\t\t\t\t\t\tentrant: " + node.getEntrant());
																	if (node.getEntrant() != null) {
																		System.out.println("\t\t\t\t\t\t\t\tname: " + node.getEntrant().getName());
																		if (node.getEntrant().getName() != null) {
																			System.out.println("\t\t\t\t\t\t\t\t\tnameString: " + node.getEntrant().getName().getValue());
																		}
																	}
																}
															});
														}
													}
												}
											});
										}
									}
								}
							});
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				t.printStackTrace();
			}
		});

		client.shutdown();
	}
}
