package oops_concept;

public class Result {
	
	public void openResult(int rollNum) {
		System.out.println("Result opened successfully with Roll-Number: "+rollNum);
	}
	
	public void openResult(String sName) {
		System.out.println("Result opened successfully with Student Name: "+sName);
	}

	public static void main(String[] args) {
		
		Result obj = new Result();
		
		obj.openResult(102);
		obj.openResult(104);
		obj.openResult("Raman Sharma");
	}

}
