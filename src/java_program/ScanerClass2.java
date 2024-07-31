package java_program;

import java.util.Scanner;

public class ScanerClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Name");
		String fn = sc.nextLine();
		
		System.out.println("Enter the Last Name");
		String ln = sc.nextLine();
		
		System.out.println("Your full Name is: "+fn+" "+ln);

	}

}
