FROM amazoncorretto:21-alpine
LABEL maintainer="Piotr"
COPY adapter/target/adapter-0.0.1-SNAPSHOT.jar cart-service-app.jar
ENTRYPOINT ["java","-jar","/cart-service-app.jar"]