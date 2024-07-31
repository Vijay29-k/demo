package automation_testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SSWebelement {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	WebElement email =	driver.findElement(By.id("email"));
	WebElement login =	driver.findElement(By.name("login"));
	WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	File f =   logo.getScreenshotAs(OutputType.FILE);
	
	Files.copy(f, new File("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\Result\\logo.png"));
	
	driver.close();

	}

}
