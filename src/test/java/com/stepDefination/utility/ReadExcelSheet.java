package com.stepDefination.utility;

import cucumber.api.java.en.Given;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadExcelSheet {


    ArrayList<String> carRegistrationNo = new ArrayList<String>();
    ArrayList<String> make = new ArrayList<String>();
    ArrayList<String> colour = new ArrayList<String>();
    private DataFormatter dataFormatter;
    String cell;

    public void ReadingAExcelFile(String excelFileName) throws IOException, InvalidFormatException, InterruptedException {
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
                } else if (cell.getColumnIndex() == 1) {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    make.add(cellValue);
                    System.out.println(cellValue);

                }

            }
        }
        Thread.sleep(5000);

    }
}