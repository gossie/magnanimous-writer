# magnanimous-writer
The repository contains a Spring-Boot implementation of a magnanimous writer to handle several versions of a REST API. Also the application implements
## Run the application
Compile all parts of the application by running `mvn clean package` on the parent. Start the application with `java -jar app/target/magnanimouswriter-app-0.0.1-SNAPSHOT.jar`
## Domain
The REST API makes it possible to retrieve and create movies. The datamodel looks like this:
![Domain](/img/domain.png)
##API
The REST API offers

Description         | URL                              | Method
------------------- | -------------------------------- | ------
Retrieve all movies | http://localhost:8080/api/movies | GET    
Create a movie      | http://localhost:8080/api/movies | POST   

To specify the version
application/vnd.magnanimouswriter.v1+json
application/vnd.magnanimouswriter.v2+json
application/vnd.magnanimouswriter.v3+json
