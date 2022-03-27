package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using="(//span[@id='nav-link-accountList-nav-line-1'])[1]")
	public WebElement loginLink;
	
	@FindBy(how = How.ID, using="createAccountSubmit")
	public WebElement createAccountBtn;
	
	@FindBy(how = How.ID, using="ap_customer_name")
	public WebElement nameText;
	
	/*@FindBy(how = How.ID, using="ap_phone_number")
	public WebElement phoneNumberText;*/
	
	@FindBy(how = How.ID, using="ap_email")
	public WebElement emailText;
	
	@FindBy(how = How.ID, using="ap_password")
	public WebElement passwordText;
	
	@FindBy(how =How.ID, using = "ap_password_check")
	public WebElement confirmPasswordText;
	
	@FindBy(how = How.ID, using="continue")
	public WebElement continueBtn;
	
	
	public void clickSigninLink() {
		loginLink.click();
	}

	public void clickCreateAccountbtn() {
		createAccountBtn.click();
	}

	public void enterNameText(String name) {
		nameText.sendKeys(name);
	}
/*
	public void enterPhoneNumberText(String phoneNumber) {
		phoneNumberText.sendKeys(phoneNumber);
	}*/

	public void enterEmailText(String email) {
		emailText.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordText.sendKeys(password);
	}

	public void clickContinue() {
		continueBtn.click();
	}

	public void enterConfirmPassword(String password) {
		confirmPasswordText.sendKeys(password);
	}

	
	
	
	
	
}
