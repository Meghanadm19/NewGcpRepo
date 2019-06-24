FROM open jdk:8-jdk-alapine
VOLUME /temp
COPY target/*.jar app/jar
ENTRYPOINT ["java","-jar","/app.jar"]