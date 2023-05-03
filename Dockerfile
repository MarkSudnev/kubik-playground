FROM arm64v8/eclipse-temurin:11-jre
WORKDIR application
COPY ./build/libs/*jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
