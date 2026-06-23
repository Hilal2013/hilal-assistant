# Stage 1: Build using Maven and Java 17
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app

# Copy ONLY the pom.xml first to download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source files
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Minimal runtime image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Safely copy the compiled jar file regardless of its exact name
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
