package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InternetSpped {

	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
	}

	@AfterMethod
	public void colseApp() {
		driver.close();
	}
	
	@Test
	public void InternetSpeed() {
		String speed = driver.findElement(By.id("speed-value")).getText();
		WebElement unit = driver.findElement(By.id("speed-units"));
		
		System.out.println("Internet Speed is: "+speed +" "+unit.getText());
		
		System.out.println("Application Title is: "+driver.getTitle());
	}
}
