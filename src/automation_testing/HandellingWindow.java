package automation_testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingWindow {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String w1 =  driver.getWindowHandle();
		
		System.out.println(w1);
		
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();	
		Thread.sleep(4000);
		
        driver.findElement(By.xpath("//a[text()='Meta Store']")).click();
		
	    Set<String>	winId =  driver.getWindowHandles();
		
	    System.out.println(winId.size());
	    
	    for(String ref : winId) {
	    	driver.switchTo().window(ref);
	    	System.out.println(driver.getTitle());
	    	Thread.sleep(2000);
	    	if(driver.getTitle().contains("Meta")==false) {
	    	driver.close();
	    	}
	    }
		
		
	}

}
