FROM eclipse-temurin:21-jdk

WORKDIR /app
#above line says all below commands are executed in /app from now
COPY ./target/*.jar ./userms.jar

CMD ["java", "-jar", "userms.jar"]