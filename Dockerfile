FROM openjdk:8-jdk-alpine
ADD target/sp-profile.jar sp-profile.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/sp-profile.jar"]