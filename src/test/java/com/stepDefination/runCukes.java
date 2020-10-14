package com.stepDefination;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources",tags = {"@data"},
        plugin = {
//        "pretty","html:test-output",

                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
//                "html:target/cucumber-report/cucumber.html"
                }
)
public class runCukes {
    @AfterClass
    public static void setup() throws IOException {
//        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = "src/test/java/com/stepDefination/propertyfile/Extent-config.xml";
//        Reporter.getExtentHtmlReport();

        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
//      Reporter.addScreenCaptureFromPath(("C:/Users/ashvi/Argos/ScreenShot/page.png").toString(), Scenario.class.getName());

    }

}
