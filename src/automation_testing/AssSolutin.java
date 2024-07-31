package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssSolutin {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Application title length should be greater than application URL length

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();

		if (title.length() > url.length()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		// Log In button should be available and should be enabled

		WebElement login2 = driver.findElement(By.id("loginbutton"));

		if (login2.isDisplayed()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		if (login2.isEnabled()) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(3000);

		// Title of the page should not contains “password1”

		String title2 = driver.getTitle();

		if (title2.contains("password2") == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Search Button should be available, and it should be enabled.

		WebElement searchButton = driver.findElement(By.id("did_submit"));

		if (searchButton.isDisplayed()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		if (searchButton.isEnabled()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.close();

	}

}
