package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBReg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	
	}

}
