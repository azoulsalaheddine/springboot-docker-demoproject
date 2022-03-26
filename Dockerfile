#define base docker image
FROM openjdk:8
LABEL maintainer="javaguides.net"
ADD target/springboot-docker-demoproject-0.0.1-SNAPSHOT.jar springboot-docker-demoproject.jar
ENTRYPOINT ["java","-jar","springboot-docker-demoproject.jar"]