package oops_concept;

class Jan {
	public void roi() {
		System.out.println("8.2%");
	}
}

class Feb extends Jan {
	public void roi() {
		System.out.println("8.4%");
	}
}

class March extends Feb
{
	public void roi() {
		System.out.println("8.3%");
	}
}
public class CurrentMonth extends March{
	
	public void roi() {
		System.out.println("8.5%");
	}

	public static void main(String[] args) {
		
		CurrentMonth obj = new CurrentMonth();
		obj.roi();
		
		Jan j = new Jan();
		j.roi();

	}

}
