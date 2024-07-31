package package2;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();

		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		System.out.println("Before Swapping a= " + a + " and b= " + b);
		
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20
		
		System.out.println("After Swapping a= " + a + " and b= " + b);

	}

}
