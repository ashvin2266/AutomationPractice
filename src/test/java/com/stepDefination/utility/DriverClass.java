package com.stepDefination.utility;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class DriverClass {
    public static WebDriver driver;
    public static Logger log;
       //    //    String isAPI;


    public static void openBrowser() throws IOException {
/*       if you want to change browser need to change in configuration VM option -Dbrowser=chrome or firefox use following syntax
       String browser=System.getProperty("browser");
   if you want to change browser from properties file use following syntax*/
        log = LogManager.getLogger(DriverClass.class.getName());
        String browser = getProperty("browser");

//        isAPI=System.getProperty("isAPI");
//        if (isAPI.equalsIgnoreCase("FALSE")) {

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
             /* if you want execute test without opening browser(Headless Browser)use this code
                ChromeOptions chromeoption=new ChromeOptions();
                chromeoption.addArguments("--headless");
                driver = new ChromeDriver(chromeoption);*/
                  driver=new ChromeDriver();
                log.info("Chrome Browser is opened");
            } else if(browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                log.info("Firefox Browser is opened");
            }

//        }
//        driver.get("https://www.startours.co.uk/");
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


//        driver.get("https://www.spicejet.com/");

////            driver.get("https://www.lastminute.com/");
//        driver.get("https://www.google.co.uk/");
////        driver.get("http://qaclickacademy.com/practice.php");
//        driver.get("http://live.guru99.com/index.php/customer/account/login/");

//          driver.get("https://www.adp.co.uk");

//        driver.get("https://www.carshop.co.uk/");

            driver.manage().deleteAllCookies();
            driver.get(getProperty("url3"));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.get("https://www.screwfix.com");
//        driver.get("https://www.d3dsecurity.co.uk");
//        driver.get("https://www.primark.com/en/homepage");
//        driver.get("https://www.gov.uk/");
//        driver.get("https://vehicleenquiry.service.gov.uk/");

    }


    public void closeBrowser(){
//        if (isAPI.equalsIgnoreCase("FALSE")) {
//            driver.quit();
        driver.close();
//        }


//    }


}public static void datePicker(WebDriver driver, WebElement element,String deparDate){

        JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','"+deparDate+"');",element);
    }
    public static String getProperty(String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("src/test/java/com/stepDefination/propertyfile/config.properties");
        prop.load(file);
        return prop.getProperty(key);


    }
    public static String takeAscreenShot(Scenario scenario, String scenarioName) throws IOException {
         scenarioName=scenario.getName().toString();
        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        String screenshotpath = new File("C:/Users/ashvi/Desktop/"+ scenarioName+".png").toString();
        String screenshotpath = new File("./target/screenShot/"+ scenarioName+".png").toString();
        FileUtils.copyFile(srcfile, new File(screenshotpath));
        System.out.println(scenarioName);
        System.out.println(screenshotpath);
        return screenshotpath;
    }
}
