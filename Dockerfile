FROM openjdk:23
ARG JAR_FILE=target/api-gateway-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} apigateway.jar
ENTRYPOINT ["java","-jar","/apigateway.jar"]