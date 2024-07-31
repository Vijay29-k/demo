package testNGFramework;

public class Test {
	
	public static int VerifySecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for ( int i=0; i<arr.length; i++) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
            return -1; 
        } else {
            return secondMax;
        }
    }

	public static void main(String[] args) {
		
		int[] arr = {7, 19,   2232, 212, 165 };
		
         System.out.println(VerifySecondLargest(arr));
	}

}
