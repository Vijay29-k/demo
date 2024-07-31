package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		boolean emailDisp = driver.findElement(By.name("email")).isDisplayed();
		boolean loginDisp = driver.findElement(By.name("login")).isDisplayed();

		System.out.println(emailDisp);
		System.out.println(loginDisp);

		boolean emailEnalbed = driver.findElement(By.name("email")).isEnabled();

		System.out.println(emailEnalbed);

		boolean loginEnaed = driver.findElement(By.name("login")).isEnabled();

		if (loginDisp == true && loginEnaed == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String title = driver.getTitle();

		System.out.println("App Title is: " + title);

		String url = driver.getCurrentUrl();

		System.out.println("App URL is: " + url);

		if (url.startsWith("www")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String att = driver.findElement(By.id("email")).getAttribute("placeholder");

		System.out.println(att);

		String tag = driver.findElement(By.name("login")).getTagName();

		System.out.println(tag);

		Dimension d = driver.findElement(By.name("login")).getSize();

		System.out.println(d);

		String txt = driver.findElement(By.name("login")).getText();

		System.out.println(txt);
		
		driver.close();

	}

}
