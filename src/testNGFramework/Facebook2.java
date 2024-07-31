package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}

	@AfterTest
	public void colseApp() {
		driver.close();
	}

	@Test
	public void ts1() {

		boolean emailDispaly = driver.findElement(By.id("email")).isDisplayed();

		if (emailDispaly == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		boolean pwdDispaly = driver.findElement(By.id("pass")).isDisplayed();

		if (pwdDispaly == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
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
