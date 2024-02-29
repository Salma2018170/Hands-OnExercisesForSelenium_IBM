# Hands-OnExercisesForSelenium_IBM

## Prerequisite
Download JDK from the link below and double click on the .exe file to install
http://www.oracle.com/technetwork/java/javase/downloads/index.html

Download Any IDE (I used IntelliJ IDEA Community Edition)
Download  IntelliJ IDEA Community Edition from the link below 
https://www.jetbrains.com/idea/download/?section=mac

## Website URL 
https://www.moneycontrol.com/
### About website 
This is a financial platform that tracks the latest updates on Indian and Global financial markets .
It also covers multiple assets from the BSE, NSE, MCX, and NCDEX exchanges so that you can
track Indices (Sensex and Nifty), Stocks, Futures, Options, Mutual Funds, Commodities, and
Currencies with ease. It has platforms across web, mobile, and tablets that makes it the largest
online financial platform in India


## SET UP SELENIUM
1. Open Maven Project 
2. Add Selenium
```
   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
</dependency>
```

3. Add TestNG framework
```
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>
```
## Framework design 
1. Page Object Model(POM)
It’s a designed pattern where we will create separate Java classes to store all the locators and
respective methods for every page. This will be more readable, easy to maintain, and
reusability is high.
2. 


