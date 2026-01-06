FROM eclipse-temurin:17-jdk
EXPOSE 8088
ADD target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]