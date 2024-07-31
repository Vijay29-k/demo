package testNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AnnotationBasic {
	
	@Test
	public void ts1() {
		System.out.println("This is Test Scenario 1");
	}
	
	@Test (description = "Verify the ts2")
	public void ts2() {
		System.out.println("This is Test Scenario 2");
	}
	
	 @Ignore  @Test
	public void ts3() {
		System.out.println("This is Test Scenario 3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
	
	

}
