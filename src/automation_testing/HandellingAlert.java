package automation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingAlert {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(1500);
		
		//Importing Alert
		Alert a = driver.switchTo().alert();
		Thread.sleep(1500);
		
		System.out.println(a.getText());
		
		//To close Alert Message
		a.dismiss();
		
		
		
		
	
	
	}
}
