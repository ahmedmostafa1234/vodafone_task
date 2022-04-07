package pageModel;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class SignUpPage extends Base_Page {

	public SignUpPage(WebDriver driver) {
		super(driver);

	}	
	
	WebElement create_account = Base_Page.findElement(By.xpath("//input[@id=('email_create')]"));
	public void create_account() 
	{
		 
		create_account.sendKeys("ahmed.amin27@hotmail.com");
	}

	WebElement click_ceate = Base_Page.findElement(By.id("SubmitCreate"));
	public void Click_create() 
	{
		
		click_ceate.click();
	}


}
