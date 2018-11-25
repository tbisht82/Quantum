package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelData {
	public String readData(String inputFile, String sheetname, int rowNumber, int columnNumber) throws Exception {
		// create file input stream object for the excel sheet
		FileInputStream fis = new FileInputStream(inputFile);
		// create object for work book
		Workbook wb = WorkbookFactory.create(fis);
		// create object for sheet present in excel using Workbook object 'wb'
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetname);
		// create object for row present in sheet using Sheet object 'sheet'
		Row row = sheet.getRow(rowNumber);
		// create object for cell present in row using Row object 'row'
		Cell cell = row.getCell(columnNumber);
		// return the value present in the excel sheet cell
		return cell.getStringCellValue();
	}

	public void writeData(String outputFile, String sheetName, int rowNumber, int columnNumber, String dataToWrite)
			throws Exception {
		// create file input stream object for the excel sheet
		FileInputStream fis = new FileInputStream(outputFile);
		// create object for work book
		Workbook wb = WorkbookFactory.create(fis);
		// create object for sheet present in excel using Workbook object 'wb'
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
		// create object for row present in sheet using Sheet object 'sheet'
		Row row = sheet.getRow(rowNumber);
		// create object for cell present in row using Row object 'row'
		Cell cell = row.createCell(columnNumber);
		cell.setCellValue(dataToWrite);
		FileOutputStream fos = new FileOutputStream(outputFile);
		wb.write(fos);
	}
}
