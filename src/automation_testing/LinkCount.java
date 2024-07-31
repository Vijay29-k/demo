package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.bankofamerica.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Number of Links are: " + links.size());

		List<WebElement> image = driver.findElements(By.tagName("img"));

		System.out.println("Total Number of Images are: " + image.size());
		
		if(links.size()> image.size()) {
			System.out.println("Number of Links are Greater");
		}
		
		else {
			System.out.println("Number of Images are Greater");
		}

		driver.close();
	}

}
