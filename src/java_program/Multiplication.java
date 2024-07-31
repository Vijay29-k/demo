package java_program;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int fn = sc.nextInt();
		
		System.out.println("Enter the Scond Number");
		int sn = sc.nextInt();
		
		System.out.println("Enter the third Number");
		int tn = sc.nextInt();
		
		System.out.println("Multiplication is: "+fn*sn*tn);

	}

}
