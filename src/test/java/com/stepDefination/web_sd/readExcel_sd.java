package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import com.stepDefination.utility.ReadExcelSheet;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class readExcel_sd extends DriverClass {
    ArrayList<String> carRegistrationNo = new ArrayList<String>();
    ArrayList<String>make = new ArrayList<String>();
    ArrayList<String>colour = new ArrayList<String>();
    private DataFormatter dataFormatter;
    String cell;

    @Given("^I am reading a Excel file \"([^\"]*)\"$")
    public void iAmReadingAExcelFile(String excelFileName) throws IOException, InvalidFormatException, InterruptedException {
       String path = System.getProperty("user.dir");
        String testDataFileName = path + "/src/test/java/com/testData/" + excelFileName;
        Workbook workbook = WorkbookFactory.create(new File(testDataFileName));
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (row.getRowNum() == 0) {
                } else if (cell.getColumnIndex() == 0) {
//                    System.out.println(cell.getColumnIndex());
                    String cellValue = dataFormatter.formatCellValue(cell);
                    Thread.sleep(2000);
                    System.out.println(cellValue);
                    carRegistrationNo.add(cellValue);
                    //  System.out.println(carRegistrationNo.size());
                }
                else if (cell.getColumnIndex()==1){
                    String cellValue = dataFormatter.formatCellValue(cell);
                    make.add(cellValue);
                    System.out.println(cellValue);

                }


                 else if (cell.getColumnIndex()==2){
                    String cellValue = dataFormatter.formatCellValue(cell);
                     colour.add(cellValue);
                    System.out.println(cellValue);
                }
//                 else if (cell.getRowIndex()==3)
            }
//                System.out.println(new CellValue(String.valueOf(cell)));
        }

//        System.out.println(carRegistrationNo.get(0));
//        driver.findElement(By.name("Vrm")).sendKeys(carRegistrationNo.get(4));
//        driver.findElement(By.name("Vrm")).sendKeys(carRegistrationNo.get(3));
//        System.out.println(carRegistrationNo.get(2));
    }
    @When("^I click No search again button on page$")
    public void iClickNoSearchAgainButtonOnPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/div[2]/fieldset/div[2]/label")).click();
    }
    @Given("^I enter first registration no from excel sheet as \"([^\"]*)\"$")
    public void iEnterFirstRegistrationNoFromExcelSheetAs(String firstReg)  {
        for (int i=0;i< carRegistrationNo.size();i++  )
        driver.findElement(By.name("wizard_vehicle_enquiry_capture_vrn[vrn]")).sendKeys((carRegistrationNo.get(i)));
    }


    @Then("^I should see  first registration no's Make as \"([^\"]*)\"$")
    public void iShouldSeeFirstRegistrationNoSMakeAs(String expected_make) throws InterruptedException {
        Thread.sleep(3000);

         String Actual_make = driver.findElement(By.xpath("//*[@id=\'main-content']/div[2]/div/form/dl/div[2]/dd")).getText();
//         #main-content > div.govuk-grid-row > div > form > dl > div:nth-child(2) > dd
//        //*[@id="main-content"]/div[2]/div/form/dl/div[2]/dd
       Assert.assertEquals(expected_make,Actual_make);

    }
    @And("^I should see first cars's colour is \"([^\"]*)\"$")
    public void iShouldSeeFirstCarsSColourIs(String expected_colour)  {
//       String actual_colour = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[3]/span[2]/strong")).getText();
//       Assert.assertEquals(expected_colour,actual_colour);
       }

    @Given("^I enter second registration no from excel sheet as \"([^\"]*)\"$")
    public void iEnterSecondRegNoFromExcelSheetAs(String second) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("Vrm")).sendKeys((carRegistrationNo.get(1)));

    }
    @Given("^I enter Third registration no from excel sheet as \"([^\"]*)\"$")
    public void iEnterThirdRegistrationNoFromExcelSheetAs(String arg0)  {
        driver.findElement(By.name("Vrm")).sendKeys((carRegistrationNo.get(2)));

    }

    @Then("^i should verify registration detail$")
    public void iShouldVerifyRegistrationDetail() throws InterruptedException {
        String Actual_registrionNo;
        for (int i=0;i< carRegistrationNo.size();i++  ){
            driver.findElement(By.name("wizard_vehicle_enquiry_capture_vrn[vrn]")).sendKeys((carRegistrationNo.get(i)));
            driver.findElement(By.id("submit_vrn_button")).click();
            Actual_registrionNo = carRegistrationNo.get(i);
            String Actual_make = driver.findElement(By.xpath("//*[@class='govuk-summary-list__value']")).getText();
            System.out.println(Actual_make);
//            //*[@id="main-content"]/div[2]/div/form/dl/div[2]/dd
            String actual_colour = driver.findElement(By.xpath("//*[@id='main-content']/div[2]/div/form/dl/div[3]/dd")).getText();
            System.out.println(actual_colour);
//            //*[@id="main-content"]/div[2]/div/form/dl/div[3]/dd
            driver.findElement(By.id("no-vehicle-confirm")).click();
            driver.findElement(By.id("capture_confirm_button")).click();
            Assert.assertEquals(carRegistrationNo.get(i),Actual_registrionNo);
            Assert.assertEquals(make.get(i),Actual_make);
            Assert.assertEquals(colour.get(i),actual_colour);
        }






}


}

