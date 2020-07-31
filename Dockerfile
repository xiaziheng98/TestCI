FROM openjdk:8u262-slim-buster

COPY ./TestCI-1.0-SNAPSHOT.jar /springboot-web-demo.jar

ENTRYPOINT ["java", "-jar", "/springboot-web-demo.jar"]