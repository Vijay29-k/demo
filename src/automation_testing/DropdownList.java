package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select obj1 = new Select(day);
		obj1.selectByValue("7");
		Thread.sleep(1000);
		
		Select obj2 = new Select(month);
		obj2.selectByIndex(9);
		Thread.sleep(1000);
		
		Select obj3 = new Select(year);
		obj3.selectByVisibleText("1996");
		Thread.sleep(2000);
		
      List<WebElement>  monthName = obj2.getOptions();
      
      System.out.println(monthName.size());
      
      for(WebElement ref : monthName) {
    	  System.out.println(ref.getText());
      }

		driver.close();
	}

}
