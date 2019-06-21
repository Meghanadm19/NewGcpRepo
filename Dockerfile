FROM open jdk:8-jdk-alapine
Volume /temp
COPY target/*.jar app/jar
ENTRYPOINT ["java","-jar","/app.jar"]