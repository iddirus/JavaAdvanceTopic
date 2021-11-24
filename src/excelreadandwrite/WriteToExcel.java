package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToExcel {


    public static void main(String[] args) {

        // 1. we need : the location where the excel file will be created ( in Data Test directory)
        // 2. name of the excel file
        // name of the excel file with extension (.XlsX): example "TestData.xlsx" under Data Test directory

        // 3. copy the Absolute path: file location
        // String filePath = "C:/Users/12019/IdeaProjects/JavaAdvanceTopic/DataTest/TestData.xlsx";
        // 4. convert absolute path to relative path
        String filePath = "../JavaAdvanceTopic/DataTest/TestData.xlsx";

        // 5. create Workbook >> SpreadSheet
        // 6. insert data to that Spreadsheet based on rows and columns : we need to
        // create 2DArray for the insertion of data to that SpreadSheet (Students: example)

        // create 2DArray:
        Object[][] athleteInfo = {
                {"ranking", "firstname", "lastName", "address"},
                {"1", "Cristiano", "Ronaldo", "Portugal"},
                {"2", "Lionel", "messi", "Argentina"},
                {"3", "Marco", "Reus", "Germany"},
                {"4", "David", "Beckham", "England"}
        };

        // 7. insert this data into the excel file we want to create under dataTest directory

        writeToExcelFile(filePath,athleteInfo,"playersDetails");



    }

    // create a method keep main method neat and clean

    public static void writeToExcelFile(String filePath,Object [][] input, String sheetName ){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNumber = 0;
        System.out.println("Excel file is created successfully");
        // use for each loop
        for (Object[] data : input) {
            Row row = sheet.createRow(rowNumber++);
            int columnNumber = 0;
            for (Object field : data) {
                Cell cell = row.createCell(columnNumber++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            System.out.println("Excel File is Created");
            workbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found Exception");
        } catch (IOException ioException) {
            System.out.println("File is closed and Done");
        }

    }


}
