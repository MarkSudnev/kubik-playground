FROM eclipse-temurin:17-jre-alpine
WORKDIR application
COPY ./build/libs/*jar ./app.jar

CMD ["java", "-jar", "app.jar"]
