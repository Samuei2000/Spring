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

# Spring Boot Properties
[Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)

## Core Properties
````
# Log levels severity mapping
logging.level.org.springframework=DEBUG
logging.level.org.hibernate=TRACE
logging.level.com.luv2code=INFO
# Log file name
logging.file.name=my-crazy-stuff.log
logging.file.path=c:/myapps/demo
````
## Web Properties
````
# HTTP server port
server.port=7070
# Context path of the application
server.servlet.context-path=/my-silly-app
# Default HTTP session time out
server.servlet.session.timeout=15m
````
## Security Properties
````
# Default user name
spring.security.user.name=admin
# Password for default user
spring.security.user.password=topsecret
````
## Data Properties
````
# JDBC URL of the database
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
# Login username of the database
spring.datasource.username=scott
# Login password of the database
spring.datasource.password=tiger
````
# MySQL
## How to change MySQL auto increment width
````
alter table student_tracker.student auto_increment =3000 
````
## How to remove all data from table and reset increment width to 1
````
TRUNCATE student_tracker.student
````

# Spring Boot REST API
| HTTP Method | EndPoint | CRUD Action |
| :-----:| :---: | :---: |
| POST | /api/empolyees/ | Create a new employee |
| GET | /api/empolyees/ | Read a list of employee |
| GET | /api/empolyees/{employeeId} | Read a single employee |
| PUT | /api/empolyees/ | Update an existing employee |
| DELETE | /api/empolyees/{employeeId} | Delete an existing employee |
