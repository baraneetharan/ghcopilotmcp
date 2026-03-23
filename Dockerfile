# Build stage
FROM maven:3.9-eclipse-temurin-25-alpine AS build
COPY . .
RUN mvn clean install -DskipTests

# Runtime stage — alpine + jdk (or switch to jre later)
FROM eclipse-temurin:25-jdk-alpine
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]