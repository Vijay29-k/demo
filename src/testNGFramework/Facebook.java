package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Facebook {
	
	/*
	 * User Story : US90056 Login the Application 
	 * Automated By: Rahual
	 * Reviewer:  Manas
	 * Date: 2nd July 2023
	 * Test ID: CS1243, CS5412
	 * 
	 * */
	
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}

	@AfterMethod
	public void colseApp() {
		driver.close();
	}

	@Test (description = "TS0453")
	public void ts1() {

		boolean emailDispaly = driver.findElement(By.id("email")).isDisplayed();

		//Assert.assertEquals(emailDispaly, true);
		
		//Applying Soft Assertion
		SoftAssert s = new SoftAssert();
		s.assertEquals(emailDispaly, true);

		boolean pwdDispaly = driver.findElement(By.id("pass")).isDisplayed();

		s.assertEquals(pwdDispaly, true);
		
		String title =  driver.getTitle();
		
		System.out.println("Application Title is: "+title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		s.assertAll();
	}

	@Test
	public void ts2() {
		boolean emailEnabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(emailEnabled);

		boolean pwdEnabled = driver.findElement(By.id("pass")).isEnabled();
		System.out.println(pwdEnabled);
	}

	@Test
	public void ts3() {
		String email = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(email);

		String pwd = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println(pwd);
	}

	@Test
	public void ts4() throws Exception {
		driver.findElement(By.id("email")).sendKeys("manasqa@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("pass")).sendKeys("manasqa@123");
		Thread.sleep(1000);
	}

}
