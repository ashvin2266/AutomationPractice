package com.stepDefination;

import com.stepDefination.DriverClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class hooks {
    DriverClass driverC =new DriverClass();


    @Before
    public void browser() throws IOException {
        driverC.openBrowser();
    }
    @After
    public void close(){
//        driverC.closeBrowser();



    }







    }
