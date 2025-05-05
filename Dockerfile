# Start from a lightweight Java runtime image
FROM openjdk:24

# Set working directory inside the container
WORKDIR /app

# Copy the built jar file from your local machine into the container
COPY app/target/app-1.0-SNAPSHOT.jar app.jar
COPY implementation/target/implementation-1.0-SNAPSHOT.jar implementation.jar
COPY api/target/api-1.0-SNAPSHOT.jar api.jar

# Command to run the jar
ENTRYPOINT ["java", "-cp", "/app/app.jar:/app/implementation.jar:/app/api.jar", "se.iths.java24.app.ConsoleApplication"]
