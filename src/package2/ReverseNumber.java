package package2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//123 Reverse is 321
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int rem; 
		int sum =0;
		
		while(num != 0) {
			
			rem = num%10;  //1
			sum = sum*10 + rem; //321
			num = num / 10; //0
		}
		
		System.out.println("Reverse Number is: "+sum);
		
		sc.close();
	}

}
