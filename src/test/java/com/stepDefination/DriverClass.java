package com.stepDefination;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverClass {
    public static
    WebDriver driver;


    public void openBrowser() throws IOException {
        String browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
////        String env= System.getProperty("env");
////        String path=System.getProperty("user.dir");
////        String file = null;
////        if (env.equalsIgnoreCase("qa")){
//             file=path + "/src/test/java/com/stepDefination/propertyfile/environment_qa.properties";}
//        else if (env.equalsIgnoreCase("uat")){
//            file=path + "/src/test/java/com/stepDefination/propertyfile/environment_uat.properties";
//        }
//        else if (env.equalsIgnoreCase("prod")){
//            file=path + "/src/test/java/com/stepDefination/propertyfile/environment_prod.properties";
//        }
//        Properties properties= new Properties();
//        FileInputStream fileInputStream=new FileInputStream(file);
//        properties.load(fileInputStream);
//        System.out.println(properties.getProperty("url"));
//        System.out.println(properties.getProperty("username"));
//





//        driver.get("http://automationpractice.com/index.php");
//        driver.get("https://www.screwfix.com");
//        driver.get("https://www.d3dsecurity.co.uk");
//        driver.get("https://www.primark.com/en/homepage");
//        driver.get("https://www.gov.uk/");
        driver.get("https://vehicleenquiry.service.gov.uk/");

    }


    public void closeBrowser() {
        driver.quit();
//        driver.close();


    }


}
