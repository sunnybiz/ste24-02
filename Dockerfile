FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY --from=0 ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]