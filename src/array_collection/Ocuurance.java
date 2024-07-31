package array_collection;

public class Ocuurance {

	public static void main(String[] args) {
		
		String s1 = "famazonnzzaazzma";
		String s2 = "";
		
		System.out.println("First Index of a is: "+s1.indexOf("a"));
		
		for(int i=s1.length()-1; i>=0; i--) {
			
			s2= s2 + s1.charAt(i);
		}
		
		
		System.out.println("Last Index of a is: "+((s2.length()-1)-s2.indexOf("a")));

	}

}
