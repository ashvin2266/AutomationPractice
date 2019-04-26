package com.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readExcel_sd extends DriverClass {
    @Given("^I am reading a Excel file \"([^\"]*)\"$")
    public void iAmReadingAExcelFile(String excelFileName) throws IOException, InvalidFormatException, InterruptedException {
        String path = System.getProperty("user.dir");
        String testDataFileName = path + "/src/test/java/com/testData/" + excelFileName;
        Workbook workbook = WorkbookFactory.create(new File(testDataFileName));
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();
        ArrayList<String> carRegistrationNo = new ArrayList<String>();

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (row.getRowNum() == 0) {
                } else {
                    if (cell.getColumnIndex() == 0) {
                        System.out.println(cell.getColumnIndex());
                        String cellValue = dataFormatter.formatCellValue(cell);
                        Thread.sleep(2000);
//                        System.out.println(cellValue);
                        carRegistrationNo.add(cellValue);
                        driver.findElement(By.name("Vrm")).sendKeys(cellValue);

                    for (int i=0;i<row.getRowNum();i++){
                        System.out.println(cellValue);
                        carRegistrationNo.add(cellValue);
                        driver.findElement(By.name("Vrm")).sendKeys(cellValue);
//                        System.out.println(i);
                    }

                    }
                }


            }
        }
//                System.out.println(new CellValue(String.valueOf(cell)));


//        System.out.println(carRegistrationNo.get(0));
//        System.out.println(carRegistrationNo.get(1));
//        System.out.println(carRegistrationNo.get(2));
    }

    @When("^I click No search again button on page$")
    public void iClickNoSearchAgainButtonOnPage() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/div[2]/fieldset/div[2]/label")).click();
    }
}
