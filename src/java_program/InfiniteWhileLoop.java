package java_program;

public class InfiniteWhileLoop {

	public static void main(String[] args) {

		int i=1;
		
		while(i!=6) {
			for(int j=1; j<5; j++) {
				System.out.println("For Loop j value is "+j);
			}
			System.out.println("While loop i value is: "+i);
			i++;
		}

	}

}
