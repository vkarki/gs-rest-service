# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS stage1
WORKDIR /home/app
COPY . /home/app/
RUN mvn -f /home/app/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine
EXPOSE 80
COPY --from=stage1 /home/app/target/rest-service.jar rest-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /rest-service.jar"]