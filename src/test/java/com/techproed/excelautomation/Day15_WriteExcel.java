package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day15_WriteExcel {

    @Test
    public void writeExcel() throws IOException {
//        Store the path of the file as string and open the file
        String path = "./src/test/java/resources/Capitals.xlsx";
//        Open the workbook
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet = workbook.getSheetAt(0);
//        Go to the first row
        Row firstRow  = sheet.getRow(0);
//        Create a cell on the 3rd column 2nd index on the first row
//        go to the first row 2dn index
//        creating a cell on 3 column (2nd index)
        Cell row1Cell3 = firstRow.createCell(2);
//        Write “POPULATION” on that cell
        row1Cell3.setCellValue("POPULATION");
//        Create a cell on the 2nd row 3th cell(index3), and write 150000
        sheet.getRow(1).createCell(2).setCellValue("150000");
//        Create a cell on the 3rd row 3th cell(index3), and write 250000
        sheet.getRow(2).createCell(2).setCellValue("250000");
//        Create a cell on the 4th row 3th cell(index3), and write 54000
        sheet.getRow(3).createCell(2).setCellValue("54000");
//        Write and save the workbook
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
//        Close the file
        fileInputStream.close();
        fileOutputStream.close();
//        Close the workbook
        workbook.close();
    }
}