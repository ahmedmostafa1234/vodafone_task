package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import Vod.Task.TestBase;

public class BlousePage extends Base_Page{
	
	
	public BlousePage(WebDriver driver) {
		super(driver);
		
	}
	
	WebElement choose_women  = Base_Page.findElement(By.xpath("//a[contains(@class, 'sf-with-ul') and text()='Women']"));
	public void choose_women() 
	{
		choose_women.click();
	}

	WebElement choose_Blouse = Base_Page.findElement(By.xpath("//*[@class='product-name' and contains(text(),'Blouse')]"));
	public void gotoCheckOutPage() 
	{
		choose_Blouse.click();
	}
	

}
