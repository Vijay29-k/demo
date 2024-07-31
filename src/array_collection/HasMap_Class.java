package array_collection;

import java.util.HashMap;

public class HasMap_Class {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Rekha");
		map.put(102, "Rahul");
		map.put(104, "Ram");
		map.put(106, "Pavan");
		map.put(103, "Manas");
		map.put(103, "Pavan");
		
		System.out.println(map);
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("A", 111);
		map1.put("B", 202);
		map1.put("C", 222);
		map1.put("D", 222);
		map1.put("E", 122);
		
		
		System.out.println(map1);
		
	//	map1.clear();
	
		
	boolean res=	map1.containsKey("E");
	System.out.println(res);
		System.out.println(map1.get("A"));
		map1.remove("E");
		
		map1.containsValue("222");
		
		
		
	}

}
