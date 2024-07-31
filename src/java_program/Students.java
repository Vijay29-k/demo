package java_program;

public class Students {

	int a; int b; int c;

    public void total(int a, int b) {
		System.out.println(a+b);
	}
	public void percentage(int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public void total1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void percentage1(int a, int b, int c) {
		System.out.println((a+b+c)/3);
	}

	public static void main(String[] args) {
		
         Students c1 = new Students();
         c1.total(84, 90); c1.percentage(84, 90);
         
         Students c2 = new Students();
         c2.total1(98, 60, 90); c2.percentage1(98, 60, 90);
	}

}
