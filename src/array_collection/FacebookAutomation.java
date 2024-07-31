package array_collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement emailAdd = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.name("login"));
		
		emailAdd.sendKeys("manasqa@gmail.com"); 
		Thread.sleep(1000);
		Password.sendKeys("Manas@123");
		Thread.sleep(1000);
		
		loginButton.click();
		Thread.sleep(4000);
		
		driver.close();
		
	
		

	}

}
