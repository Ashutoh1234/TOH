FROM openjdk:16
EXPOSE 8080
ADD target/docker-jenkins-integration-TOH.jar docker-jenkins-integration-TOH.jar
ENTRYPOINT ["java","-jar","docker-jenkins-integration-TOH.jar"]