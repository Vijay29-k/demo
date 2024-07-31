package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Basic {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("gautamqa04@gmail.com");
        Thread.sleep(1000);
        
        driver.findElement(By.id("pass")).sendKeys("Gautam@1234");
        Thread.sleep(1000);
        
		/*
		 * driver.findElement(By.id("email")).clear(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("pass")).clear(); Thread.sleep(1000);
		 */
        
        driver.findElement(By.name("email")).sendKeys("Ankit04@gmail.com");
        Thread.sleep(1000);
        
        driver.findElement(By.name("pass")).sendKeys("Ankit@1234");
        Thread.sleep(3000);
        
        
        driver.close();
		
	}

}
