package java_program;

import java.util.Scanner;

public class ScnaerClass {

	public static void main(String[] args) {
	
		//Importing the scanner class by creating the object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter the Value of b");
		int b = sc.nextInt();
		
		System.out.println("Addition of A and B is: "+(a+b));

	}

}
