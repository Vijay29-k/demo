package package2;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s = "MadaM";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev+ s.charAt(i);
			
		}
		
		if(rev.equals(s)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Its Not Palindrom");
		}

	}

}
