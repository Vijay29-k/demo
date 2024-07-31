package array_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL_Consloe {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Element: ");
		
		for(int i=0; i<4; i++) {
			String val = sc.next();
			l.add(val);
		}
		
		
		System.out.println(l);

	}

}
