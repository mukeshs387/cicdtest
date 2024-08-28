FROM openjdk:17-alpine
EXPOSE 8080
ADD target/cicdspring-boot-project.jar cicdspring-boot-project.jar
ENTRYPOINT ["java","jar","/cicdspring-boot-project.jar"]