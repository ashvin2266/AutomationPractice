package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp_sd extends DriverClass {
    @Given("^I read the Property file$")
    public void iReadThePropertyFile() throws IOException {

        Properties prop=new Properties();
        String path= System.getProperty("user.dir");
        FileInputStream Is =new FileInputStream("src/test/java/com/stepDefination/propertyfile/config.properties");
        prop.load(Is);
        System.out.println(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));

    }
}
