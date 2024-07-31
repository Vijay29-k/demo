package java_program;

public class SplitMethod {

	public static void main(String[] args) {
		
		String a = "Farheen Taj"; 

		
		String[]  arr = a.split("");
		
		System.out.println(arr.length);
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
