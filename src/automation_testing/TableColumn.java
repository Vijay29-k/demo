package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColumn {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	WebElement dataTable =	driver.findElement(By.xpath("//*[@class = 'dataTable']"));
	
     List<WebElement> bankName =   dataTable.findElements(By.tagName("a"));
     
     for(WebElement ref : bankName) {
    	 System.out.println(ref.getText());
     }
     
     List<WebElement>  prevCloser = dataTable.findElements(By.xpath("//*[@class = 'dataTable']//td[4]"));
    
     for(WebElement ref : prevCloser) {
    	 System.out.println(ref.getText());
     }
     
     
     
     driver.close();
	}
}
