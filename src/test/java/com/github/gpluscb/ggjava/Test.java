package com.github.gpluscb.ggjava;

import com.github.gpluscb.ggjava.api.GGClient;
import com.github.gpluscb.ggjava.api.RateLimiter;
import javax.annotation.Nonnull;

public class Test {
	private static final String testQuery = "query TournamentQuery{tournament(slug:\"evo2018\"){events{name standings(query:{page:1,perPage:3}){nodes{standing entrant{name}}}}}}";
	
	public static void main(@Nonnull String[] args) {
		// rateLimiterTest();
		clientTest(args);
	}
	
	private static void rateLimiterTest() {
		RateLimiter limiter = RateLimiter.bucketBuilder().build();
		
		for(int i = 0; i < 200; i++) {
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
		if(args.length == 0) {
			System.out.println("Give token pls");
			return;
		}
		
		GGClient client = GGClient.builder(args[0]).limiter(RateLimiter.bucketBuilder().period(61000L).tasksPerPeriod(80).build()).build();
		
		for(int i = 0; i < 100; i++) {
			int i_ = i;
			client.request(testQuery).thenAccept(r -> System.out.println("No. " + (i_ + 1) + " finished at " + System.currentTimeMillis())).exceptionally(t -> {
				t.printStackTrace();
				return null;
			});
		}
		
		client.shutdown();
	}
}
