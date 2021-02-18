package webapp.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Identify all elements in Homepage
	@FindBy(partialLinkText = "Create New Account")
	WebElement reisterbtn;

	@FindBy(name = "firstname")
	WebElement firstnametxt;

	@FindBy(name = "lastname")
	WebElement lastnametxt;

	@FindBy(name = "reg_email__")
	WebElement regemail;

	@FindBy(name = "reg_passwd__")
	WebElement regpassword;

	@FindBy(name = "birthday_day")
	WebElement birthday;

	@FindBy(name = "birthday_month")
	WebElement birthmonth;

	@FindBy(name = "birthday_year")
	WebElement birthyear;

	@FindBy(xpath = "//*[@id=\"u_o_2_ws\"]")
	WebElement selectFemale;

	@FindBy(name = "websubmit")
	WebElement submitregbtn;

	// Open Register window In homepage
	public void regitserNew() {
		clickButton(reisterbtn);
	}

	// Complete Register window in HomePage
	public void completeRegister(String firstName, String lastName, String email, String password, String day,
			String Month, String year) {
		setTextElementText(firstnametxt, firstName);
		setTextElementText(lastnametxt, lastName);
		setTextElementText(regemail, email);
		setTextElementText(regpassword, password);
		select = new Select(birthday);
		select.selectByValue(day);
		select = new Select(birthmonth);
		select.selectByValue(Month);
		select = new Select(birthyear);
		select.selectByValue(year);
		clickButton(selectFemale);
		clickButton(reisterbtn);

	}
}
