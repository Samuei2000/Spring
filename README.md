# Run Spring Boot apps from the Command Line
## Option 1: Use **java -jar**
Example:`java -jar myapp.jar`<br>
jar is self-contained, nothing else to install
## Option 2: Use Spring Boot Maven plugin
If you already have Maven installed previously:<br>
Then you can ignore/delete the mvnw files,just use Maven as you normally would to run a Maven project<br>
`mvn clean compile test`<br>
add maven plugin:
````XML
<build>
  <plugins>
    <plugin>
	<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>
</plugins>
</build>
````
Then run `mvn package` and `mvn spring-boot:run` or  `./mvnw package` and `./mvnw spring-boot:run`
