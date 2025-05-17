FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY build/libs/my-app-*.jar /app/my-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "my-app.jar"]
