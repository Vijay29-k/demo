package package2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//153 = 1+125+27
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int temp = num;
		int rem; 
		int sum =0;
		
		while(num != 0) {
			
			rem = num % 10;  //1
			sum = sum + (rem*rem*rem);
			num = num / 10; // 0
		}
		
		if(temp==sum) {
			System.out.println("Its Armstrong Number");
		}
		else {
			System.out.println("Its Not Armstrong Number");
		}
		
	}


}
