package webapp.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	    
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "email")
	WebElement emaillogin;
	
	@FindBy(id = "pass")
	WebElement passlogin;
	
	@FindBy(name = "login")
	WebElement loginbtn;
	
	public void LoginUser(String email, String password) {
		setTextElementText(emaillogin, email);
		setTextElementText(passlogin, password);
		clickButton(loginbtn);
	}

}
