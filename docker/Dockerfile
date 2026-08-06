FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY. /app
RUN./mvnw clean package -DskipTests

FROM openjdk:21-jdk-slim AS runtime
WORKDIR /app
COPY --from=build /app/target/ecommerce-0.0.1-SNAPSHOT.jar /app/ecommerce.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ecommerce.jar"]