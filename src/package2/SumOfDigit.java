package package2;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		//123 = 1+2+3 = 6
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int rem; 
		int sum =0;
		
		while(num != 0) {
			
			rem = num%10;  //1
			sum = sum + rem; // 3+2+1
			num = num / 10; // 0
		}
		
		System.out.println("Sum of digit is: "+sum);
		
	}

}
