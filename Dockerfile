FROM gradle:6.9.3-jdk11-alpine AS builder

WORKDIR /app
COPY . /app
RUN cd /app && ./gradlew build

#FROM openjdk:11.0.16-jre
#COPY --from=builder /app/build/ 
