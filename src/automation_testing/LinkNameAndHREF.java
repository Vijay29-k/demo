package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkNameAndHREF {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ref : links) {
			System.out.println(ref.getText()+" href: "+ref.getAttribute("href"));
		}
	
        driver.close();
	}

}
