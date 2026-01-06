FROM eclipse-temurin:17-jdk
EXPOSE 8088
ADD target/springboot-images-green.jar springboot-images-green.jar
ENTRYPOINT ["java","-jar","/springboot-images-green.jar"]