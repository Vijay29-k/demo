package package2;

public class EH1 {

	public static void main(String[] args) {
		
		try {
			int data = 100/10;	
		}
		
		catch (Exception e) {
			System.out.println("Can't devide by zero");
		}
		
		finally {
			System.out.println("Rest of the code...");
		}
		

	}

}
