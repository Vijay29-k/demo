package array_collection;

import java.util.HashSet;
import java.util.Set;

public class HS_Class {

	public static void main(String[] args) {
		
		Set<Integer> h = new HashSet();
		
		
		h.add(101);
		
		h.add(120);
		h.add(104);
		h.add(106);
		h.add(104);
		
		System.out.println(h.size());
		
		for(int data :h) {
			System.out.println(data);
		}

	}

}
