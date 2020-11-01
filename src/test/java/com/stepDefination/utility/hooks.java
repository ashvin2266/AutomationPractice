package com.stepDefination.utility;


import com.cucumber.listener.Reporter;
import com.stepDefination.utility.DriverClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class hooks {
    DriverClass driverC =new DriverClass();
    WebDriver driver;


    @Before
    public void browser() throws IOException {
      driverC.openBrowser();
    }
    @After()
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String scenarioName=scenario.getName().toString();
//            driverC.takeAscreenShot(scenario,scenarioName );
            Reporter.addScreenCaptureFromPath(driverC.takeAscreenShot(scenario,scenarioName));
            System.out.println(scenarioName);
        }
//        driverC.closeBrowser();

    }
//    @After()
//    public void close(){
//        driverC.closeBrowser();
//    }
    }
