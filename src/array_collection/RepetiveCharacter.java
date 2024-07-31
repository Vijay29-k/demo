package array_collection;

public class RepetiveCharacter {

	public static void main(String[] args) {
		
		String s1 = "manasnis";
		String s2 = "";
		
		
		String[] arr = s1.split("");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					
					s2 = s2+ arr[i];		
				}	
			}
		}
		
   System.out.println(s2.charAt(1));
	}

}
