package com.generics.TakeScreenshotActiTIME;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getCellValue(String path, String sheetName, int row, int cell) throws IOException
	{
		FileInputStream fis =  new FileInputStream(excelPath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
}
