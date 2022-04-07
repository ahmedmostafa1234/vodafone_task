package pageModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends Base_Page {

	public CreateAccount(WebDriver driver) {
		super(driver);

	}	
WebElement Gender = Base_Page.findElement(By.xpath("//input[@id=('id_gender1')]")); //(xpath = "")
	
	public void ChooseGender() {
		Gender.click();
	}
	WebElement FirstName = Base_Page.findElement(By.id("customer_firstname"));
	public void firstname() {
		FirstName.sendKeys("Ahmed");
	}
	WebElement LastName = Base_Page.findElement(By.id("customer_lastname"));
	public void lastname() {
		LastName.sendKeys("Mostafa");
	}
	WebElement email = Base_Page.findElement(By.id("email"));
	public void email() {
		email.sendKeys("ahmed.amin28@hotmail.com");
	}
	WebElement password = Base_Page.findElement(By.id("passwd"));
	public void password() {
		password.sendKeys("12345678");
	}
	WebElement address = Base_Page.findElement(By.id("address1"));
	public void address() {
		address.sendKeys("NasrCity");
	}
	WebElement city = Base_Page.findElement(By.id("city"));
	public void city() {
		city.sendKeys("Cairo");
	}
	
	public void select_state() 
	{
		Select State = new Select(Base_Page.findElement(By.id("id_state")));
		State.selectByIndex(3);
	}
	WebElement postcode = Base_Page.findElement(By.id("postcode"));
	public void postcode() {
		postcode.sendKeys("12345");
	}
	public void select_country() 
	{
		Select Country = new Select(Base_Page.findElement(By.id("id_country")));
		Country.selectByIndex(1);
	}
	WebElement phone = Base_Page.findElement(By.id("phone_mobile"));
	public void phone() {
		phone.sendKeys("123456789");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	WebElement registerBtn = Base_Page.findElement(By.id("submitAccount"));

	public void gotoBlousePage() {
		registerBtn.click();
	}

}
