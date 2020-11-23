FROM openjdk:11
ADD target/quiz-application-mysql.jar quiz-application-mysql.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "quiz-application-mysql.jar"]