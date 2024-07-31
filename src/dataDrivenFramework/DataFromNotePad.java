package dataDrivenFramework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataFromNotePad {

	public static void main(String[] args) throws Exception {
		
		//Importing File Reader class to Identify the Location of Notepad
		
		FileReader f = new FileReader("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\5June.txt");
		
		//Importing BufferedReader Class to open the Notepad
		
		BufferedReader b = new BufferedReader(f);
		
		System.out.println(b.readLine());

	}

}
