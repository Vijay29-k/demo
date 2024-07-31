package array_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericAL {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();  //Generic Collection
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l.add("Rahul");
		l.add("Rekha");
		l.add("Shibani");
		l.add("Manas");
		l.add("Atharva");
		l.add("Akshu");
		l.add("Ayushi");
		l.add("Rahul");
		
		for(String data : l) {
			System.out.println(data);
		}
		
		System.out.println(l);
		
		l.remove(6);
		
		System.out.println(l);

		l.add("Imran");
		
		l.set(3, "Pavan");
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		Collections.reverse(l);
		
		System.out.println(l);
		
		
		

	}

}
