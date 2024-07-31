package oops_concept;

class Father {
	public void gold() {
		System.out.println("Gold");
	}
	
	public void lands() {
		System.out.println("Lands");
	}
}

class Child1 extends Father {
	public void shares() {
		System.out.println("Shares");
	}
}

public class Child2 extends Father {
	public void house() {
		System.out.println("House");
	}

	public static void main(String[] args) {
	
		Child2 c2 = new Child2();
		c2.gold(); c2.lands(); c2.house(); 
		
		Child1 c1 = new Child1();
		c1.gold(); c1.lands(); c1.shares(); 

		Father f = new Father();
		f.gold(); f.lands(); 
	}

}
