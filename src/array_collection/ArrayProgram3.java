package array_collection;

public class ArrayProgram3 {

	public static void main(String[] args) {
		
		int[] arr = { 4, 22, 44, 25, 38, 55, 56, 28, 24 };
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=20 && arr[i]<29) {
			continue;
			}
			System.out.print(arr[i] + " ");
		}

	}

}
