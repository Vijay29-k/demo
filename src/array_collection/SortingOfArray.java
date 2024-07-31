package array_collection;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		if (size == 0) {
			System.out.println("Size should be Greater than 0, enter the new size");
		}

		else {
			System.out.println("Enter the " + size + " Elements");

			int[] arr = new int[size];

			// Loop to accept the data into Array

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			// Loop to print the data of an array

			System.out.print("Array is: ");

			for (int res : arr) {
				System.out.print(res + " ");
			}
                   int temp;
			// Loop to sort the array in Ascending order
			for(int i=0; i<size; i++) {
				for(int j= i+1; j<size; j++)
				{
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					
					}
				}
			System.out.println();
			System.out.print("Sorted array is: ");
			
			for(int data : arr) {
				System.out.print(data+" ");
			}
		}
	}
}
