package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import Vod.Task.TestBase;

public class CheckOutPage extends Base_Page{
	
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath = "//button[@class=(\"exclusive\")]")
	WebElement AddToCart;
	public void addtocart() 
	{
		AddToCart.click();
	}
	@FindBy (xpath = "//a[@class=(\"btn btn-default button button-medium\")]")
	WebElement ProceedToCheckOut;
	public void Proceed() 
	{
		ProceedToCheckOut.click();
	}
	
}
