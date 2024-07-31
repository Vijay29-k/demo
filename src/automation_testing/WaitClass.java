package automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
     	//	Applying Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Manas");
		driver.findElement(By.id("pass")).sendKeys("Manas");
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 48));
		
		w.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 47));
		
		w.until(ExpectedConditions.titleContains("Facebook"));
		
		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		
		driver.close();
		

	}

}
