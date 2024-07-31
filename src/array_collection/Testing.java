package array_collection;

public class Testing {

	public static void main(String[] args) {
		
		String s1 = "manasnisasssaaaggs";
		String s2 = "";
		
		
		String[] arr = s1.split("");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					if(s2.contains(arr[i])==false) {
					s2 = s2+ arr[i];
					}
				}	
			}
		}
                  System.out.println(s2);
	}

}
