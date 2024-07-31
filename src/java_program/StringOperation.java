package java_program;

public class StringOperation {

	public static void main(String[] args) {
		
		String a = "Manas QA";
		String b = "GSIT";
		String c = " Grow IT ";
		
		System.out.println(a);
		System.out.println(a.length());
		
		System.out.println(a.startsWith("MaN"));
		System.out.println(a.endsWith(" QA"));
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.isEmpty());
		System.out.println(a.contains(b));
		
		System.out.println(a.concat(b));
		
		System.out.println(a.charAt(6));
		System.out.println(a.indexOf("z"));
		
		System.out.println(c);
		System.out.println(c.trim());
		
		System.out.println(c.replace(" ", ""));
		
		

	}

}
