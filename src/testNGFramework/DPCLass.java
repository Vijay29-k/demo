package testNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPCLass {

	@DataProvider (name = "Testdata") 
	public Object[][] dpMethod(){
		
		return new Object[][] { {"data-one"}, {"data-two"}, {"data-three"}};
	}
	
	@Test (dataProvider = "Testdata")
	public void testMethod(String data) {
		
		System.out.println("Data is: "+data);
		
	}
}
