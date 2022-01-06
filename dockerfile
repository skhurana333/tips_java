# syntax=docker/dockerfile:1


FROM adoptopenjdk/openjdk16

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src
COPY confDir ./confDir
COPY README.md ./
RUN echo $(ls  /app)

WORKDIR /etc
RUN mkdir   confDir
COPY confDir /etc/confDir
RUN echo $(ls  /etc/confDir)
RUN echo $(cat  /app/src/main/java/com/skh/tips/controller/TipsController.java)


WORKDIR /app
RUN ./mvnw dependency:go-offline
CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.arguments=--DB_URL=from_docker"] 
