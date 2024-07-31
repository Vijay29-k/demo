package array_collection;

import java.util.Scanner;

public class ArrayFromConsloe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		if(size ==0) {
			System.out.println("Size should be Greater than 0, enter the new size");
			
		}
		
		else {
		System.out.println("Enter the "+size+" Elements");
		
	
		
		int[] arr = new int[size];
		
		
		
		//Loop to accept the data into Array 
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Loop to print the data of an array
		
		System.out.print("Array is: ");
		
		for(int res : arr) {
			System.out.print(res+" ");
		}
		
		// Loop to Print the array in Reverse Order
		System.out.println();
		System.out.print("Reverse Array is: ");
		for(int i= size-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		//Loop to print sum and avg of the array
		int sum =0;
		
		for(int data : arr) {
			sum = sum+data;
		}
		System.out.println();
		System.out.println("Sum of the array is: "+sum);
		
		int avg = sum/size;
		System.out.println("Avg of the array is: "+avg);

	}
	}
}
