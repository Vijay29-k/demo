package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(16000);
		
		String speed = driver.findElement(By.id("speed-value")).getText();
		WebElement unit = driver.findElement(By.id("speed-units"));
		
		System.out.println("Internet Speed is: "+speed +" "+unit.getText());
		
		driver.close();
		
		
		

	}

}
