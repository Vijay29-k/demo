package package2;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		//123 Reverse is 321
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int temp = num;
		
		int rem; 
		int rev =0;
		
		while(num != 0) {
			
			rem = num%10;  //1
			rev = rev*10 + rem; //321
			num = num / 10; //0
		}
		
		if(temp==rev) {
			System.out.println("Its Palidrom Number");
		}
		else {
			System.out.println("Its Not Palidrom Number");
		}
		
		sc.close();

	}

}
