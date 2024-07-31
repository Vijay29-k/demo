package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Importing the PageObject class By Creating the object
		
		POByClass obj = new POByClass();
		
		driver.findElement(obj.uid).sendKeys("manas.qa@gmail.com");
		driver.findElement(obj.uid).isEnabled();
		driver.findElement(obj.uid).isDisplayed();
		
		Thread.sleep(1000);
		
		driver.findElement(obj.pwd).sendKeys("Manas@333");
		
		driver.findElement(obj.loginButton).isDisplayed();
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
