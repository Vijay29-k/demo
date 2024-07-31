package oops_concept;

class GrandParent {
	public void gold() {
		System.out.println("Gold");
	}
}

class Parent extends GrandParent {
	public void lands() {
		System.out.println("Lands");
	}
}

public class Children extends Parent {

	public void shares() {
		System.out.println("Shares");
	}
	
	public static void main(String[] args) {
		
		Children c = new Children();
		c.shares(); c.gold(); c.lands();
		
		Parent p = new Parent();
		p.gold(); p.lands(); 
	}

}
