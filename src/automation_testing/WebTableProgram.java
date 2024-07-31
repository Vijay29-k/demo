package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableProgram {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	WebElement dataTable =	driver.findElement(By.xpath("//*[@class = 'dataTable']"));
	
	List<WebElement> tr =   dataTable.findElements(By.tagName("tr"));
	List<WebElement> tc =   dataTable.findElements(By.tagName("th"));
	List<WebElement> td =   dataTable.findElements(By.tagName("td"));
	
	System.out.println("No of Rows are: "+tr.size());
	System.out.println("No of  Columns are: "+tc.size());
	System.out.println("No of  Datas are: "+td.size());
	
	WebElement icici =  dataTable.findElement(By.xpath("//*[@class = 'dataTable']//tr[7]//td[3]"));
	
	System.out.println(icici.getText());
	
	driver.close();
		
	}
}
