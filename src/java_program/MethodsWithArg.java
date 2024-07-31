package java_program;

public class MethodsWithArg {
	
	//Creating Methods with Argument
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void multiply(int n1, int n2) {
		System.out.println(n1*n2);
	}

	
	public static void main(String[] args) {
		
		add(120, 80);
		add(750, 1250);
		add(625, 275);
		
		MethodsWithArg m = new MethodsWithArg();
		m.multiply(125, 750);

	}

}
