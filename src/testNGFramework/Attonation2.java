package testNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Attonation2 {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	
	@Test (description = "Verifying the Login Functionality")
	public void ts1() {
		System.out.println("This is Test Scenario 1 TS-P1230");
	}
	
	@Test (description = "Verifying the Email Textbox TS-P1231")
	public void ts2() {
		System.out.println("This is Test Scenario 2");
	}
	
	@Test (description = "Verifying the Password Textbox TS-P1232")
	public void ts3() {
		System.out.println("This is Test Scenario 3");
	}
	
	
}
