package com.example.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

  public static void main(String[] args) {
    // task: to print userid and password of third user in excel_data.xlsx

    String filePath = "src/main/resources/excel_data.xlsx";
    FileInputStream fis = null;
    XSSFWorkbook workbook = null;

    try {
      //1. create object of workflow
      fis = new FileInputStream("src/main/resources/excel_data.xlsx");
      workbook = new XSSFWorkbook(fis);

      //2. create object of sheet
      int numSheet = workbook.getNumberOfSheets();
      XSSFSheet sheet = null;

      for (int i = 0; i < numSheet; i++) {
        if (workbook.getSheetName(i).equalsIgnoreCase("logindata")) {
          sheet = workbook.getSheetAt(i);
        }
      }

      //3. fetch data from sheet
      Iterator itrow = sheet.iterator();
      while(itrow.hasNext()) {
        Row row = (Row) itrow.next();
        Iterator itcell = row.cellIterator();
        Cell cell = (Cell) itcell.next();
        if (cell.getStringCellValue().equals("Cynthia Morales")) {
          while (itcell.hasNext()) {
             cell = (Cell) itcell.next();
             if(cell.getCellType()== CellType.STRING) {
               System.out.println(cell.getStringCellValue());
             }
          }
        }
      }

    } catch (IOException e) {
      throw new RuntimeException("Failed to read Excel file", e);
    } finally {
      try {
        if (workbook != null) {
          workbook.close();
        }
        if (fis != null) {
          fis.close();
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
