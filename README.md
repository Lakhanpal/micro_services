# micro_services

There are total 4 spring boot application involved in this example.

# 1. Gateway service

# 2. Eureka Service

# 3. Feedback MicroService

# 4. User profile MicroService


This example demonstrate a simple example how you can use feing client to communicate between micro service using Netflix Eureka Registry.
there are 2 micro-services userservice and feedbackservice.

1.) start discovery service it will start on port `8761`.


2.) Configure user-service and feedback-service to register at discovery service you have started in first point.
   you can check in application.yml of both the microservices how i pointed the service to eureka server.
   
   
3.) start micro services. user service will start on `8001` and feedbackservice will start on `8002`.


4.) check http http://localhost:8761/ you will be able to see both the services listed on eureka server.


5.) Now i have user service `/hello` api to be consumed by feedback service using `@FeignClient` you can check the feingClient Code in 
feedbackService --> com.techmojo.feedback.client.UserServiceClient .


start all the server and open http://localhost:8002/swagger-ui.html#/feedback-controller/greetingUsingGET (feedbackservice) and check if you are getting the response '<request param>' from Lakhan!.
   
  # Gateway service
  
  A spring boot app that allow you to provide gateways to connect UI to micro services.
  
  # Eureka Service
  
  Registry Service allow you to register your micro services on eureka server.That later help you to communicate with each other with service name rather then ip and port.
  
  
  
  
  
