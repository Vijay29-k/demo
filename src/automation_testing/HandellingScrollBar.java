package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingScrollBar {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.olacabs.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1500);
		
		
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,4000)");
			 
			  Thread.sleep(1500);
			  
			  JavascriptExecutor js1 = (JavascriptExecutor)driver;
			  js1.executeScript("window.scrollBy(0,-2000)");
			 
		
		

	}

}
