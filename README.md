# facebookAutomation
automation testing for Facebook webapplication
Scope: Register and Login 

Teck stach:
Selenium webdriver using Java
Maven
TestNG
DDT 
Excel sheet



# Provided solution 
  Add 3 test accounts on my app on facebook
  Add account Email and password to excel sheet as data source 
   Using Data driven framework to identify data from excel sheet in "ExcelDriver" class 
 Create Maven project using POM and Idetify our Test Sturture in "TestBase" Class and Pages structure in "PageBase"
 Add test case for login using "DataProvider" annotation 



# How to run test
 pre-requisits Install Java and set up. Install Maven, JRE
 Add Dependency in POM File: Junit, apache poi, apache poi-ooxml (both should be same version), Selenium
 Add chrome driver path to "TestBase"
 Navigate to the project folder using cmd or terminal and run the below commands: mvn clean, mvn compile, mvn test


