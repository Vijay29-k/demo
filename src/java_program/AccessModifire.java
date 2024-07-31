package java_program;

public class AccessModifire {
	
	public int n1 =10;
	protected int n2 = 20;
	private int n3 = 30;
	int n4 = 40;

	public static void main(String[] args) {
		
		AccessModifire a = new AccessModifire();
		
		System.out.println(a.n1+a.n2+a.n3+a.n4);
		

	}

}
