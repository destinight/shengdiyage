FROM openjdk:8-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
RUN apk add tini && apk add telnet && apk add curl
ENTRYPOINT [ "java", "-jar", "/app.jar"]
