package oops_concept;

class Parents {
	int a =20;
	public void lands() {
		System.out.println("Lands");
	}
}

public class Child extends Parents{

	int a =30;
	public void gold() {
		System.out.println("Gold");
		System.out.println(this.a); //30
		System.out.println(super.a); //20
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.lands();
		c.gold();
		
		
	}
}
