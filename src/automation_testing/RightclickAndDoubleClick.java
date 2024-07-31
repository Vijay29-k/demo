package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAndDoubleClick {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Importing Action class
		Actions a = new Actions(driver);
		
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		WebElement rc =  driver.findElement(By.id("rightClickBtn"));
		
		a.doubleClick(dc).perform();
		a.contextClick(rc).perform();
		
		
		a.dragAndDrop(rc, dc).perform();

	}

}
