FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/test1-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
#ENTRYPOINT ["java"]
CMD ["java", "-jar", "test1-0.0.1-SHANPSHOT.jar"]

#FROM alpine:3.11.2
#RUN apk add --no-cache openjdk11
#COPY build/libs/test1-0.0.1-SNAPSHOT.jar /app/
#WORKDIR /app/
#CMD ["java", "-jar", "/test1-0.0.1-SNAPSHOT.jar"]
