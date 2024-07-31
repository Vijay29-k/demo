package java_program;

public class NonStaticVar1 {

	public int n1;
	public int n2 = 30;
	
	public static void main(String[] args) {
		
		NonStaticVar1 obj = new NonStaticVar1();
		
		
       System.out.println(obj.n1+obj.n2);

	}

}
