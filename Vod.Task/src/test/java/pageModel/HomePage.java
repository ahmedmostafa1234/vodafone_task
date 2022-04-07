package pageModel;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

//import Vod.Task.TestBase;

public class HomePage extends Base_Page {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	WebElement Signup = Base_Page.findElement(By.xpath("//a[@class=('login')]"));
	public void goToSignUpPage()  {
		
		Signup.click();
		
	}
	               




}




