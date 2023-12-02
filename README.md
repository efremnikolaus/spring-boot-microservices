### Spring Boot Microservices

### Running the Application with Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the Docker image locally.
2. Execute `docker-compose up -d` to start the applications.

### Running the Application without Docker

1. Run `mvn clean verify -DskipTests` inside each folder to build the applications.
2. After that, run `mvn spring-boot:run` inside each folder to start the applications.
