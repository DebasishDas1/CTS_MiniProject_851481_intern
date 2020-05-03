package com_java_methods;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ItemToSearch {
    public static String Item() throws IOException {
        FileInputStream fin = null;
        try {
            // set file path
            File src = new File("src/ExcelSheets/src.xlsx");
            fin = new FileInputStream(src);
        }
        catch (FileNotFoundException e) {
            System.out.println("The error is : " + e);
        }
        assert fin != null;
        XSSFWorkbook wb = new XSSFWorkbook(fin);
        XSSFSheet sh0 = wb.getSheet("Sheet1");
        // return the item to searched
        return sh0.getRow(0).getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
    }
}

