# facebookAutomation
automation testing for Facebook webapplication
Scope: Register and Login 

Teck stach:
Selenium webdriver using Java
Maven
TestNG
DDT 
Excel sheet



#**Provided solution **
1- Add 3 test accounts on my app on facebook
2- Add account Email and password to excel sheet as data source 
3- Using Data driven framework to identify data from excel sheet in "ExcelDriver" class 
4- Create Maven project using POM and Idetify our Test Sturture in "TestBase" Class and Pages structure in "PageBase"
5- Add test case for login using "DataProvider" annotation 



#**How to run test**
1- pre-requisits Install Java and set up. Install Maven, JRE
2- Add Dependency in POM File: Junit, apache poi, apache poi-ooxml (both should be same version), Selenium
3- Add chrome driver path to "TestBase"
4- Navigate to the project folder using cmd or terminal and run the below commands: mvn clean, mvn compile, mvn test


