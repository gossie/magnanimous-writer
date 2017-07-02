# magnanimous-writer
The repository contains a Spring-Boot implementation of a magnanimous writer to handle several versions of a REST API. Also the application implements
## Domain
The REST API makes it possible to retrieve and create movies. The datamodel looks like this:
![Domain](/img/domain.png)
##API
The REST API

................... | URL                              | Method
------------------- | -------------------------------- | -------------
Retrieve all movies | http://localhost:8080/api/movies | GET
Create a movie      | http://localhost:8080/api/movies | POST

application/vnd.magnanimouswriter.v3+json
