# Microservice-with-RabbitMQ
This is a simple Microservice with RabbitMQ.

## Version
* Java : 17
* Spring Boot Version (Eureka Server) : 3.0.6
* Spring Boot Version (API Gateway) : 3.0.6
* Spring Boot Version (User Service) : 3.0.6
* Spring Boot Version (Contact Service) : 3.0.6
* Spring Boot Version (Audit Service) : 3.0.6
* MySQL : 8.0

**[Rabbit MQ](https://www.rabbitmq.com/documentation.html) Official Documentation**

Here project Eureka server act as a DNS
project API Gateway act as a bridge for other service and help them communicate
User service perform CRUD operation where as save data of Contact using feign client
Contact service perform CRUD operation using the data given by user service.

In order to work with this project 
You need to change the following:-

* In APIGateway :-
Change the service url to the url of the Eureka server running path.

* In User service :- 
Change the service url to the url of the Eureka server running path.
Change the rabbutMQ configuration to the url of the RabbitMQ server running path.
Change the datasource url,username and password to your mysql url path, username and password respectively.

* In Contact service :-
Change the service url to the url of the Eureka server running path
Change the datasource url,username and password to your mysql url path, username and password respectively.

* In Audit service :- 
Change the datasource url,username and password to your mysql url path, username and password respectively.
Change the rabbutMQ configuration to the url of the RabbitMQ server running path.

### In order to run this project
1. Run the Eureka Server
2. Copy the path of server and enter it in APIGateway and User Service and Contact Service.
3. Run APIGateway
4. Run RabbitMQ server.
5. Copy the path of rabbitMQ server and enter it in User Service and Audit Service.
6. Run MySQL Server
7. Enter the path of MySQL server in User Service and Contact Service
8. Run User Service
9. Run Contact Service
