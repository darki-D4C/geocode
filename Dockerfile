FROM openjdk:11-jre-slim
ENV PORT 8080

COPY /build/libs/* ./app.jar

EXPOSE $PORT
ENTRYPOINT ["java"]
CMD  ["-jar", "app.jar"]