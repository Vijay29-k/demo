package automation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingAlert1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		//Importing Alert
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		//To close the Alert message
		a.dismiss();
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}

}
