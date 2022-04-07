package Vod.Task;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageModel.BlousePage;
import pageModel.CheckOutPage;
import pageModel.CreateAccount;
import pageModel.HomePage;
import pageModel.SignUpPage;

public class Tests extends TestBase {
	HomePage HP;
	SignUpPage SP;
	CreateAccount ca;
	BlousePage BL;
	CheckOutPage CP;

	@Test	
	public void Test_Case_01 ()   
	{
		HP = new HomePage(driver);
		HP.goToSignUpPage();
		SP = new SignUpPage(driver);
		SP.create_account();
		SP.Click_create();	
		ca = new CreateAccount(driver);
		ca.ChooseGender();
		ca.firstname();
		ca.lastname();
		ca.password();
		ca.phone();
		ca.select_state();
		ca.postcode();
		ca.select_country();
		ca.city();
		ca.address();
		ca.gotoBlousePage();
		BL = new BlousePage(driver);
		BL.choose_women();
		BL.gotoCheckOutPage();	
		CP = new CheckOutPage(driver);
		CP.addtocart();
		CP.Proceed();
	}

}
