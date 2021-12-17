# syntax=docker/dockerfile:1

FROM openjdk:16-alpine3.13

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src
COPY confDir/  confDir 

RUN ./mvnw dependency:go-offline
CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.arguments=--DB_URL=from_docker"] 
