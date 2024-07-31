package java_program;

public class Methods {

     //Creating Static Method
	public static void m1() {
		int a =100;
		int b =150;
		System.out.println(a+b);
	}
	
	//Creating Non Static method
	public void m2() {

		int a =10;
		int b =30;
		
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		m1();
	
		Methods m = new Methods();
		m.m2();
		
		MethodsWithArg.add(4000, 6000);
	}
}
