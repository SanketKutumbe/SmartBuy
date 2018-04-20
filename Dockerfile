FROM openjdk:8
ADD target/smartbuy-mysql.jar smartbuy-mysql.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "smartbuy-mysql.jar"]