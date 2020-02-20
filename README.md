# gg-java
Java wrapper for the [smash.gg](https://smash.gg) [GraphQL API](https://developer.smash.gg/docs/intro)

## Download
### Download:
This repo is published as a snapshot on Sonatype OSS. You can download it [here](https://oss.sonatype.org/content/repositories/snapshots/com/github/gpluscb/gg-java/).\
If you are using Maven, add the following to your repositories in your pom.xml:
```xml
<repository>
    <id>oss.sonatype.org-snapshot</id>
    <url>http://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
        <enabled>false</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```
And this to your dependencies:
```xml
<dependency>
    <groupId>com.github.gpluscb</groupId>
    <artifactId>gg-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
If you are using Gradle, add the following to your repositories in your build.gradle:
```gradle
maven {
    url 'https://oss.sonatype.org/content/repositories/snapshots/'
}
```
And this to your dependencies:
```gradle
implementation group: 'com.github.gpluscb', name: 'ChallongeListener', version: '1.0.0-SNAPSHOT'
```

## Usage
```java
String testQuery = "query TournamentQuery{tournament(slug:\"evo2018\"){events{name standings(query:{page:1,perPage:3}){nodes{standing entrant{name}}}}}}";

GGClient client = GGClient.builder("your-token-here").build();

client.request(testQuery)
	.thenAccept(r -> {
		System.out.println("Success!");
		System.out.println(r.toString());
	})
	.exceptionally(t -> {t.printStackTrace(); return null;});
client.shutdown();
```
The [smash.gg API docs](https://developer.smash.gg/docs/intro) will be an useful resource, especially the [GraphQL reference](https://developer.smash.gg/reference).
For a tutorial on how to construct the GraphQL queries, visit https://graphql.org/learn/.

Every request returns a CompletableFuture\<JsonObject\> currently for handling stuff asynchronously.

For reference, here's the [gson repo](https://github.com/google/gson) used for all the JSON stuff.
All responses will have the format `{"data": {...}}`.

### Variables
```java
String testQuery = "query TournamentQuery($slug:String){tournament(slug:$slug){events{name standings(query:{page:1,perPage:3}){nodes{standing entrant{name}}}}}}";
JsonObject testVariables = new JsonObject();
testVariables.addProperty("slug", "evo2018");

client.request(testQuery, testVariables)
	// ...
	;
```

### Rate limiting
The [rate limiting](https://developer.smash.gg/docs/rate-limits) is handled automatically and you should never run into one. If you still do, a message will be printed to `System.err` and the request will retry ater a back-off.

You can still specify custom rate limits if you want to.
For example if you want to adhere to a 80/40s bucket:
```java
GGClient client = GGClient.builder("your-token-here").limiter(RateLimiter.bucketBuilder().tasksPerPeriod(80).period(40000L).build()).build();
```
*I have done some testing with the rate limit system. It seems like, for the default rate limits, clients have to respect an 80/61s bucket instead of an 80/60s one as the docs would suggest, so that's the default.*

## TODO
* More efficient way to add variables
* Documentation
* Proper configurable logging
* Generally better code structure (whatever that means)
* Have the response in Java Objects instead of a JsonObject (see [feature-entities](https://github.com/gpluscb/gg-java/tree/feature-entities) branch), a lot of the code will be generated
* Builder for GraphQL queries, later specific to the project for more tight syntax and less room for illegal queries
