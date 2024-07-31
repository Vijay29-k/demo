package array_collection;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		
		int[] arr = { 4, 22, 44, 25, 38, 55, 56, 28, 24 };
	
		for(int i : arr) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		String[] name = {"Himashree", "Ayushi", "Gautam", "Shibani", "Ankit", "Imran"};
		
		for(String j : name) {
			System.out.print(j+"  ");
		}

	}

}
