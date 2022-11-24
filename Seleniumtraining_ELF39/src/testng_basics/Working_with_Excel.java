package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_Excel {
	@Test
	public void excel_Demo() throws IOException {
		String filepath="./Test_Data/Test_Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		
		//Create object for excel file
		Workbook book=new XSSFWorkbook(fis);
		
		//Access the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//Get row count and column count
		int rowcount=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(col_count);
		Object[][] data=new Object[rowcount][col_count];
		//Print all the rows and columns
		for(int row=1;row<=rowcount-1;row++) {
			for(int col=0;col<=col_count-1;col++) {	
		data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(data[row][col]);
		
			}
		}
		for(int i=0;i<=data.length-1;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println(data[i][j]);
			}
			book.close();	
		}
	}
		}	

