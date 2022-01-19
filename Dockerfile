FROM openjdk:8
EXPOSE 8080
ADD target/springboot-cicd.war springboot-cicd.war
ENTRYPOINT ["java", "-war", "/springboot-cicd.war"]