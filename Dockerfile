FROM openjdk:8-jdk-alpine
COPY spring-boot-rest-controller/build/libs/spring-boot-rest-controller-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch spring-boot-rest-controller-1.0-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","spring-boot-rest-controller-1.0-SNAPSHOT.jar"]
