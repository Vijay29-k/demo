package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement jobMenu = driver.findElement(By.xpath("//*[text()='Jobs']"));
		
		//Importing Action class
		Actions a = new Actions(driver);
		
		//Move the cursor into job menu
		a.moveToElement(jobMenu).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='IT jobs']")).click();
		

	}

}
