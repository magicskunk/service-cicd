FROM openjdk:17.0.2-jdk
WORKDIR /app
COPY build/libs/service-cicd-0.0.1-SNAPSHOT.jar /app/application.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${SPRING_PROFILE:default}", "-Duser.timezone=UTC", "-Ddebug=${DEBUG_FLAG:false}", "application.jar"]
