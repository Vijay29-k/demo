package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WBElement {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        WebElement email =    driver.findElement(By.id("email"));
        WebElement pwd =  driver.findElement(By.id("pass"));
        WebElement login =  driver.findElement(By.name("login"));
        
        System.out.println(email.isDisplayed());
        System.out.println(email.isEnabled());
        System.out.println(pwd.isDisplayed());
        System.out.println(pwd.isEnabled());
        
        email.sendKeys("manasqa04@gmail.com");
        pwd.sendKeys("Manas@1234567");
        
        email.clear();
        pwd.clear();
        
        driver.close();
       
	}

}
