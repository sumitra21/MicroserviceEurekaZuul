# MicroserviceEurekaZuul
Microservice with eureka and zuul implementation

This Project I implemented Netflix Ereka server as Resistry Server where all the microservices get registered.
Also used hystrix Feign client to communicate between the microservices. Also use fallback service for fault tolarance.
Used zuul api gate way to call every microservice by using zull url and port no.

Ex- http://localhost:8762/college-service/colleges

http://{zuul url}:{port}/{application_name(which microservice you want to call)}/api name

Like from zuul we are calling all microservices
http://localhost:8762/department-service/depts
http://localhost:8762/student-service/students
http://localhost:8762/college-service/colleges

Call individual Microservices
http://localhost:8080/colleges
http://localhost:8081/students
http://localhost:8082/depts
