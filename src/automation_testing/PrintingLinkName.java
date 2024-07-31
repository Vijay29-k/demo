package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingLinkName {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1500);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Number of Links are: " + links.size());
		
		/*
		 * for( WebElement ref : links) {
		 *  System.out.println(ref.getText());
		 *   }
		 */
		
		for(int i=0; i<links.size(); i++) {
			 String linkName = links.get(i).getText();
			 if(linkName.contains("Facebook")==true) {
				 System.out.println(linkName);
			 }
		}
		
		driver.close();
}
}
