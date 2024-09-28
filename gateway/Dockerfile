FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY ./target/*.jar ./gateway.jar

CMD ["java", "-jar", "gateway.jar"]