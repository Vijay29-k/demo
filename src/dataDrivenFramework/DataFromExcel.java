package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class DataFromExcel {

	public static void main(String[] args) throws Exception {
		
		//Importing FileInputStream Class to Identify the location of Excel
		
		FileInputStream f = new FileInputStream("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\8AMBatch.xls");
	 
		//Opening Identified Workbook/Excel
		
		Workbook wb = Workbook.getWorkbook(f);
		
		//Opeing Sheet in a Opened Workbook
		
		Sheet s = wb.getSheet("Sheet1");
		
		//Idetifying the cell in sheet and read the data from cell (c,r)
		
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(2, 23).getContents());
		
	
	}

}
