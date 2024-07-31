package automation_testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreensohtClass {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 Files.copy(f, new File("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\Result\\reddiff.png"));

	 driver.close();
	}

	
	
}
