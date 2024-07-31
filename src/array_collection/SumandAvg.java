package array_collection;

public class SumandAvg {

	public static void main(String[] args) {
	
		int[] age = {28, 34, 24, 44, 48, 56, 66, 57};
		
		float sum =0;
		for(int data : age) {
			sum = sum +data;
		}
		System.out.println("Sum of all the Age is: "+sum);
		
		float avg = (sum/age.length);
		
		System.out.println("Avg of all the Age is: "+avg);
	}

}
