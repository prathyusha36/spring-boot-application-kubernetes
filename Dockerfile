FROM openjdk:11
ADD target/muzix-app.jar app.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","app.jar"]