package Vod.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class TestBase {

	public static WebDriver driver;

	@BeforeClass
	public void Open_Browser ()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driverr\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");		
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}

	@AfterClass
	public void Close_Browser( ) 
	{
		driver.close();
	}


}
