### Spring Boot Microservices

The system aims to automate processes, enhance data management efficiency, and establish a secure platform. It focuses on facilitating seamless and accurate online ordering.
Technologies: Java, Spring Boot, Spring Cloud, Docker, MongoDB, MySQL, Keycloak, Netflix Eureka, Kafka

### Running the Application with Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the Docker image locally.
2. Execute `docker-compose up -d` to start the applications.

### Running the Application without Docker

1. Run `mvn clean verify -DskipTests` inside each folder to build the applications.
2. After that, run `mvn spring-boot:run` inside each folder to start the applications.
