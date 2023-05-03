FROM openjdk:11
COPY . /usr/src/kubikapp
WORKDIR /usr/src/kubikapp
RUN ./gradlew clean assemble
WORKDIR /usr/src/kubikapp/build/libs
CMD ["java", "-jar", "kubik-0.0.1-SNAPSHOT.jar"]
