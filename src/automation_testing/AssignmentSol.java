package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSol {

	public static void main(String[] args)  throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Image");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement eyeIcon =  driver.findElement(By.xpath("//img[@class='Image_image1']"));
		
		System.out.println(eyeIcon.getAttribute("src"));
		System.out.println(eyeIcon.getAttribute("alt"));
		
		driver.close();

	}

}
