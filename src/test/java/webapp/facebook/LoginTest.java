package webapp.facebook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ulities.ExcelDriver;

import java.io.IOException;
public class LoginTest extends TestBase {
	LoginPage loginpageObject;
	
	@DataProvider(name = "ExcelDataa")
	public Object[][] userDataRegisterationExcel() throws IOException {
		ExcelDriver e = new ExcelDriver();
		return e.getExcelData();
	}

	@Test(dataProvider = "ExcelDataa", enabled = true)
	public void fbLogin(String email,String Password)  {
		loginpageObject = new LoginPage(driver);
        loginpageObject.LoginUser(email, Password);
		
	
	}
}