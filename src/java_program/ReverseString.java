package java_program;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Manas";
		
		for(int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i));
		}
		
		System.out.println();
		
		for(int i= a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}

	}

}
