package webapp.facebook;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ulities.ExcelDriver;

import java.io.IOException;

public class LoginTest extends TestBase {
	LoginPage loginpageObject;

	@Test(dataProvider = "ExcelDataa")
	public void fbLogin(String email, String Password) {
		loginpageObject = new LoginPage(driver);
		loginpageObject.LoginUser(email, Password);
		String expectedUrl = "https://www.facebook.com/";
		String ActurlUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActurlUrl);

	}

	//identify  data from exceldriver class
	@DataProvider(name = "ExcelDataa")
	public Object[][] userDataRegisterationExcel() throws IOException {
		ExcelDriver e = new ExcelDriver();
		return e.getExcelData();
	}

}