# BDD-Cucumber-Demo

This project provides Backend APIs for properties rental websites , IOS and Android devices.

## Getting Started

### Prerequisites

- [Git](https://git-scm.com/) Source Code Management
- [JDK8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) JDK 1.8
- [Spring Boot](http://projects.spring.io/spring-boot/) Get App up and running as quickly as possible.
- [Maven 3](https://maven.apache.org/download.cgi) Maven Build Tool
- [Junit 4](http://junit.org/junit4/) Unit Testing Tool
- [Mysql](https://www.mysql.com/) - Databse
- [Swagger](http://swagger.io/swagger-ui/) - Swagger UI is a dependency-free collection of HTML, Javascript, and CSS assets that dynamically generate beautiful documentation and sandbox from a Swagger-compliant API.

 
### Install Cucumber

1. Search `Cucumber Editor` in Eclipse -> Help -> Install New Software.
2. Download and install it.
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/install%20cucumber.PNG)


### Add Cucumber report plugin in pom.xml

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/Add%20cucumber%20report%20plugin.PNG)

### Run Rent API Application

Run `mvn spring-boot:run` to start Rest Rent APi service. After server starting, type `http://http://localhost:5000/swagger-ui.html#/` to check the APIs in the Swagger Pages.
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/Start%20Swagger.PNG)


### Prepare Test Cases

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/testcase.PNG)

#### Example for feature and step definitions

1. Create test case for UserCreate.feature
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/Cucumber%20feature.PNG)
2. Create Step definitions for the UserCreate.feature
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/StepDefinition.png)
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/StepDefinitions1.PNG)

### Run Test Cases
Run `mvn clean install` to install dependencies.

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/run%20test%20case.png)

After run completed, check the build status and results.
![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/check%20status.png)

### Testing Report

The Cucumber report plugin will generated the report after executing the test cases, go to Project folder, check report under `\target\cucumber-html-reports\cucumber-html-reports`

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/Overview%20feature%20reports.png)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/status%20of%20all%20features.png)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-11-16/view%20report%20for%20one%20feature.PNG)