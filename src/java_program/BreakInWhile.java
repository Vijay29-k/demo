package java_program;

public class BreakInWhile {

	public static void main(String[] args) {
		
		int i =0;
		while (i<=5) {
			
			if(i==4) {
				break;
			}
			
			System.out.println(i);
			i++;
		}

	}

}
