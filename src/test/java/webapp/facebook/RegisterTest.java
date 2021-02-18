package webapp.facebook;

import org.testng.annotations.Test;

public class RegisterTest extends TestBase{
	HomePage hompageObject;
	String firstName, lastName, email, password, day, Month,  year;
	
	
	//Open Register Pop up
	@Test
	public void registerNewUser() {
		hompageObject = new HomePage(driver);
		hompageObject.regitserNew();
		hompageObject.completeRegister(null, null, null, null, null, null, null);
	}
	
	

}
