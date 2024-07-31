package dataDrivenFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject {
	
	@FindBy (id = "email") WebElement email;
	@FindBy (id = "pass") WebElement pwd;
	@FindBy (name= "login") WebElement loginButton;
	@FindBy (xpath = "//a[text()='Forgotten password?']") WebElement ForgotPwdLink;

}
