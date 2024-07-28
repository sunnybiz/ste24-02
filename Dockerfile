FROM maven:3.8.6-eclipse-temurin-17-alpine AS builder

WORKDIR /app
COPY . /app

RUN mvn package

FROM adoptopenjdk:11-jre-openj9

WORKDIR /app
COPY --from=builder /app/target/*.jar /app/java-application.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/java-application.jar"]