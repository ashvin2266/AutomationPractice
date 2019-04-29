package com.stepDefination;

import cucumber.api.PendingException;
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
import java.util.List;

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
        driver.findElement(By.name("Vrm")).sendKeys((carRegistrationNo.get(0)));
    }


    @Then("^I should see  first registration no's make as \"([^\"]*)\"$")
    public void iShouldSeeFirstRegistrationNoSMakeAs(String expected_make) throws InterruptedException {
        Thread.sleep(2000);
               String Actual_make = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[2]/span[2]/strong")).getText();
       Assert.assertEquals(expected_make,Actual_make);


    }

    @And("^I should see first cars's colour is \"([^\"]*)\"$")
    public void iShouldSeeFirstCarsSColourIs(String expected_colour)  {
       String actual_colour = driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/ul/li[3]/span[2]/strong")).getText();
       Assert.assertEquals(expected_colour,actual_colour);
    }

    @Given("^I enter second reg,no from excel sheet as \"([^\"]*)\"$")
    public void iEnterSecondRegNoFromExcelSheetAs(String second)  {
        driver.findElement(By.name("Vrm")).sendKeys((carRegistrationNo.get(1)));

    }
}

