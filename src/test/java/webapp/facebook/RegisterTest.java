package webapp.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase{
	HomePage hompageObject;
	String firstName, lastName, email, password, day, Month,  year;
	
	
	//Open Register Pop up
	@Test
	public void registerNewUser() throws InterruptedException {
		hompageObject = new HomePage(driver);
		hompageObject.regitserNew();
		Thread.sleep(100);
		hompageObject.completeRegister("Asma", "Ahmed", "asma@email.com","asma@email.com", "@Asa2031993", "1", "Feb", "1996");
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("websubmit")));
		hompageObject.validateReg();
		
	}
	
	

}
