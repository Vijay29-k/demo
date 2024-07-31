package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DatapProviderFB {
	
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws Exception {
		
		ExtentSparkReporter rp = new ExtentSparkReporter("extent-report.html");
		ExtentReports  extent = new ExtentReports();
		extent.attachReporter(rp);
		
		ExtentTest t = extent.createTest("Setup-Test");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}

	@AfterMethod
	public void colseApp() {
		driver.close();
	}
	
	@DataProvider (name = "FB Test Data")
	public Object[][] data() {
		Object[][] obj = new Object[3][2];
		
		obj[0][0]= "Manas";  obj[0][1] = "Manas@123";
		obj[1][0]= "Ankit";  obj[1][1] = "Ankit@123";
		obj[2][0]="Shibani"; obj[2][1] = "Shibani@123";
		
		return obj;
	}
	
	@Test (dataProvider =  "FB Test Data")
	public void loginCredentialValidation(String uid, String pwd) throws Exception {
		
		driver.findElement(By.id("email")).sendKeys(uid);
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
	}

}
