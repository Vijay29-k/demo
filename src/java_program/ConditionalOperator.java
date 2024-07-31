package java_program;

public class ConditionalOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		int c = 12;
		int d = 10;

		
		System.out.println((a != d || d != c) || (a != b && c < a));
		System.out.println(a++ <= ++d && a < c || c != d && b > ++d);
	}

}
