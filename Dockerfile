FROM openjdk:8

ADD target/demo-employee.jar demo-employee.jar

EXPOSE 2020

ENTRYPOINT ["java","-jar","demo-employee.jar"]