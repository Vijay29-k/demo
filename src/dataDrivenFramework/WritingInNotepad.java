package dataDrivenFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInNotepad {

	public static void main(String[] args) throws Exception {
		
		//Importing FileWriter class
		
		FileWriter f = new FileWriter("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\5June2024.txt");
	 
		BufferedWriter b = new BufferedWriter(f);
		
		b.write("Hi ! Welcomoe to Automation Testing Training");
		
		b.newLine();
		
		b.write("By GSIT Bangalore");
		
		b.close();
	
	}

}
