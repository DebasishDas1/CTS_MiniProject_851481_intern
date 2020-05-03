package com_java_methods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddToExcel {
    public static void items(ArrayList<String> name, ArrayList<String> cost) {
        try {
            //set file path
            String filepath = "src/ExcelSheets/output.xlsx";
            FileOutputStream fos = new FileOutputStream(new File(filepath));
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sh = wb.createSheet("TestCase");
            sh.createRow(0);
            // heading of data
            sh.getRow(0).createCell(0).setCellValue("Product Name");
            sh.getRow(0).createCell(1).setCellValue("Price");
            //data entry
            for(int i=0 ; i<name.size() ; i++) {
                sh.createRow(i+1);
                sh.getRow(i+1).createCell(0).setCellValue(name.get(i));
                sh.getRow(i+1).createCell(1).setCellValue(cost.get(i));
            }
            //write on the excel file
            wb.write(fos);
            //close the stream
            fos.close();
        }
        catch (IOException e) {
            System.out.println("THe error is : " + e);
        }
    }
}