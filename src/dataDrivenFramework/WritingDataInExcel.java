package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WritingDataInExcel {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\8AMOutput.xls");
		
		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet ws = wb.createSheet("Result", 1);
		
		int a = 20;
		int b = 40;
		int c = a+b;
		
		Label l = new Label(0,0, "C value is: "+c);
		
		ws.addCell(l);
		
		//Saving and Closing the excel
		wb.write();
		wb.close();
		
		
		
		
	}

}
