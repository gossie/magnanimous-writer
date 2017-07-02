# magnanimous-writer
The repository contains a Spring-Boot implementation of a magnanimous writer to handle several versions of a REST API. Also the application implements
## Run the application
Compile all parts of the application by running `mvn clean package` on the parent. Start the application with `java -jar app/target/magnanimouswriter-app-0.0.1-SNAPSHOT.jar`.
## Domain
The REST API makes it possible to retrieve and create movies. The datamodel looks like this:
![Domain](/img/domain.png)
## API
The REST API provides a GET and a POST method on the movie resource.

Description         | URL                              | Method
------------------- | -------------------------------- | ------
Retrieve all movies | http://localhost:8080/api/movies | GET    
Create a movie      | http://localhost:8080/api/movies | POST   

There are three versions of the REST API. The version is part of the media type.

* application/vnd.magnanimouswriter.v1+json
* application/vnd.magnanimouswriter.v2+json
* application/vnd.magnanimouswriter.v3+json

 When an older version is requested, the request is forwarded through each newer version and finally executed on the domain.
