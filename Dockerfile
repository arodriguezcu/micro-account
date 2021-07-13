FROM openjdk:8-alpine
COPY "./target/micro-account-0.0.1-SNAPSHOT.jar" "appmicro-account.jar"
EXPOSE 8094
ENTRYPOINT ["java","-jar","appmicro-account.jar"]