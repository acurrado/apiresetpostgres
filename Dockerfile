#FROM openjdk:17-alpine
#COPY target/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar ApiRestPostgresExample-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar"]


FROM maven:3.8.5-openjdk-17 AS build
COPY . /project
RUN  cd /project && mvn package

FROM openjdk:17-alpine
#FROM alpine
#RUN apk add --update --no-cache openjdk8
COPY --from=build /project/target/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar /ApiRestPostgresExample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/ApiRestPostgresExample-0.0.1-SNAPSHOT.jar"]