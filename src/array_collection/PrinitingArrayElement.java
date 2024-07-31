package array_collection;

public class PrinitingArrayElement {

	public static void main(String[] args) {

		int[] arr = { 4, 22, 44, 24, 38, 55, 56, 28, 24 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.print("Reverse array is: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
