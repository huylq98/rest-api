FROM openjdk:8
ADD target/rest-api-0.0.1-SNAPSHOT.jar rest-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/rest-api.jar"]