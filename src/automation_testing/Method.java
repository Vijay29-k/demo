package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {

	WebDriver driver;

	// Creating the method to launch the application

	public void launchApp(String url) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	// Creating the method to close the Application

	public void closeApp() {
		driver.close();
	}

	// Creating the method to check element is Available or not

	public void elementAvailable(String loc) {
		boolean elementDisp = driver.findElement(By.id(loc)).isDisplayed();

		if (elementDisp == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

     //Creating the method to check element is Clickable or not

	public void elementClickable(String loc, boolean exp) {
		boolean elementEnabled = driver.findElement(By.id(loc)).isEnabled();

		if (elementEnabled == exp) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	//Creating the method to verify url contains any string or not
	
	public void urlContains(String exp) {
		
	String url =	driver.getCurrentUrl();
	if(url.contains(exp)==true) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	}
	
	
	//Creating the method to verify title contains any string or not
	
		public void titleContains(String exp) {
			
		String title =	driver.getTitle();
		if(title.contains(exp)==true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		}
	
	
	
	

}
