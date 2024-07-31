package automation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[text()='Show Alert']")).click();
		
		Thread.sleep(1500);
		
		//Importing Alert
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.dismiss();
		
		Thread.sleep(1500);
		
		driver.close();

	}

}
