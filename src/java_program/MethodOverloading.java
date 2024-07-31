package java_program;

public class MethodOverloading {
	
	public void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public void add(int n1, int n2, int n3, int n4) {
		System.out.println(n1+n2+n3+n4);
	}


	public static void main(String[] args) {
		
       MethodOverloading m = new MethodOverloading();
       
       m.add(20, 30);
       m.add(22, 33);
       m.add(20, 40, 40);
       m.add(10, 20, 30, 50);
	}

}
