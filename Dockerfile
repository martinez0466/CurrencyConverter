# Start from a lightweight Java runtime image
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built jar file from your local machine into the container
COPY app/target/app-1.0-SNAPSHOT.jar app.jar

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
