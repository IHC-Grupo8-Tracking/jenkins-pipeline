FROM gradle:6.9.3-jdk11-alpine AS builder

LABEL version=0.0.1

WORKDIR /app
COPY . /app
RUN cd /app && ./gradlew build

FROM openjdk:11.0.16-jre
COPY --from=builder /app/build/libs/jenkins-pipeline-1.0-SNAPSHOT.jar .
CMD ['java', '-jar', 'jenkins-pipeline-1.0-SNAPSHOT.jar']
