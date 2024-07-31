package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class PrinintingTable {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream(
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\8AMBatch.xls");

		// Opening Identified Workbook/Excel

		Workbook wb = Workbook.getWorkbook(f);

		// Opeing Sheet in a Opened Workbook

		Sheet s = wb.getSheet("Sheet1");
		
		int rc =s.getRows();
		int cc =s.getColumns();
		
		for(int i=0; i<rc; i++) {
			for(int j=0; j<cc; j++) {
				System.out.print(s.getCell(j, i).getContents()+ "  ");
			}
			System.out.println();
		}

	}

}
