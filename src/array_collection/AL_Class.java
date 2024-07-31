package array_collection;

import java.util.ArrayList;
import java.util.List;

public class AL_Class {

	public static void main(String[] args) {

       List l = new ArrayList();
       
       l.add("Manas");
       l.add("Ankit");
       l.add(102);
       l.add(true);
       l.add('c');
       l.add(104);
       l.add(106.84);
      
     
      
      
       System.out.println(l);
       
       l.add("Rekha");
       
       l.remove(4);
       l.add("Manas");
       System.out.println(l);
       
       
		
	}

}
