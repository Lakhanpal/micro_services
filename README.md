# micro_services

This example demonstrate a simple example how you can use feing client to communicate between micro service using Netflix Eureka Registry.
there are 2 micro-service userservice and feedbackservice.

1.) start discovery service on port 8761.
2.) Configure user-service and feedback-service to register at discovery service you have started in first point.
   you can check in application.yml of both the microservices how i pointed the service to eureka server.
3.) start micro services.
4.) check http http://localhost:8761/ you will be able to see both the services listed on eureka server.
5.) Now i have user service `/hello` api to be consumed by feedback service using @FeignClient you can check the feingClient Code in 
feedbackService --> com.techmojo.feedback.client.UserServiceClient .

start all the server and open http://localhost:8002/swagger-ui.html#/feedback-controller/greetingUsingGET (feedbackservice) and check if you are getting the response '<request param>' from Lakhan!.
  
