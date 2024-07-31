package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POCalling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		PageObject p = PageFactory.initElements(driver, PageObject.class);
		
		System.out.println(p.email.isDisplayed());
		System.out.println(p.pwd.isDisplayed());
		
		p.email.sendKeys("ManasQA04@GMAIL.COM");
		Thread.sleep(1000);
		p.pwd.sendKeys("Manas@234");
		Thread.sleep(1000);
		
		p.email.clear();
		p.email.sendKeys("ankitqa@gmail.com");
		
		System.out.println(p.loginButton.isDisplayed());
		System.out.println(p.loginButton.isEnabled());
		
		driver.close();

	}

}
