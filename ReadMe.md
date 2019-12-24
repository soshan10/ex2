# Challenge

Given a web endpoint "\GET", create an API prepare an application that will receive as an input an integer number. 
·                If the integer is a multiple of 7, it should return "C", 
·                If the integer is a multiple of 9, it should return "N", 
·                If the integer is a multiple of both 7 and 9, then both "CN" should be displayed. 
otherwise the provided integer should be returned. 
·                The output of the API should be a properly formatted JSON file

## Solution

Spring boot Rest service created to implement this Challenge

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

Java

SpringBoot



### Installing

Run the following commands at shell

mvnw clean package

java -jar target\ex2-0.0.1-SNAPSHOT.jar

The Rest service should be runnning at port 8083

## Running the tests

The tests include:

http://localhost:8083/index?i=7

http://localhost:8083/index?i=9

http://localhost:8083/index?i=63

http://localhost:8083/index?i=1



## Built With

* [SpringBoot](https://spring.io/projects/spring-boot/) - The service
* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.java.com/) - Programming language


## Authors

Soshan Fernandes