package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadFromExcel {
    // we need the file location
    public static final String FILE_NAME = "../JavaAdvanceTopic/DataTest/ReadExcelFile_TestData.xlsx";

    public static void main(String[] args) {

        ReadFromExcel.readExcelFile(FILE_NAME,1);


    }

    public static void readExcelFile(String fileName, int sheetNumber){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + " ");
                    } else if (currentCell.getCellType() == CellType.BOOLEAN) {
                        System.out.print(currentCell.getBooleanCellValue() + " ");
                    }
                }
                System.out.println();
            }

        } catch (FileNotFoundException fn) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            System.out.println("Reading done ");
        }
    }


}
