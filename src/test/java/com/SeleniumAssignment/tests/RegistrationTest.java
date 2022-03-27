package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.RegistrationPage;

public class RegistrationTest extends BaseTest {
	@Test(groups={"sanity","registration","util"} )
	@Parameters({"name","phoneNumber","email","password"})
	public void RegistrionFormTest(String name, String phoneNumber, String email, String password) {
		
		et=er.startTest("Registration Test Case.");
		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickSigninLink();
		rp.clickCreateAccountbtn();
		rp.enterNameText(name);
		//rp.enterPhoneNumberText(phoneNumber);
		rp.enterEmailText(email);
		rp.enterPassword(password);
		rp.enterConfirmPassword(password);
		rp.clickContinue();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
	

}
