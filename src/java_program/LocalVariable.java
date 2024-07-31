package java_program;

public class LocalVariable {
	
	public  int a = 20;
	
	public static void m1() {
	    int a =20;
		int b =40;
		
		System.out.println(a+b);
	}
	
	public static void m2() {
		int a = 40;
		int b = 60;
		System.out.println(a*b);
	}

	

	public static void main(String[] args) {
		
		m2();
		m1();

	}

}
