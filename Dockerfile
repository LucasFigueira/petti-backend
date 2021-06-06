FROM adoptopenjdk/openjdk11:alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
EXPOSE 8080