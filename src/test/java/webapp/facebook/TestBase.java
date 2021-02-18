package webapp.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Start() {
		System.setProperty("webdriver.chrome.driver",
				"ChromeDriver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
//	  @AfterMethod public void Close()
//	  {
//		  driver.quit();
//		  }

}
