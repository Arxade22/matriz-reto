FROM openjdk:8-jdk-alpine
MAINTAINER ssiccha
RUN addgroup -S qdsgroup && adduser -S qds -G qdsgroup
USER qds:qdsgroup
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} qds-probe-1.0.jar
ENTRYPOINT ["java","-jar","/qds-probe-1.0.jar"]
