package com.SeleniumAssignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.ID , using="twotabsearchtextbox")
	public WebElement searchBar;
	
	/*@FindBy(how =How.ID, using = "nav-search-submit-button")
	public WebElement searchBtn;*/
	
	@FindBy(how = How.XPATH, using ="//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']" )
	public WebElement bestSellerBtn;
	
	@FindBy(how = How.LINK_TEXT, using ="Mobiles" )
	public WebElement mobilesBtn;
	
	@FindBy(how = How.LINK_TEXT, using ="Electronics" )
	public WebElement  electronicsBtn;
	
	@FindBy(how = How.LINK_TEXT, using ="Customer Service" )
	public WebElement customerServiceBtn;
	
	@FindBy(how = How.LINK_TEXT, using ="Prime" )
	public WebElement PrimeBtn;
	
	@FindBy(how = How.LINK_TEXT, using ="Fashion" )
	public WebElement fashionBtn;

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Facebook']")
	public WebElement facebookBtn;
	
	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Twitter']")
	public WebElement twitterBtn;
	
	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Instagram']")
	public WebElement instagramBtn;
	
	public void enterSearchText(String searchText) {
		searchBar.sendKeys(searchText);
	}

	public void clickSearchIcon() {
		WebElement searchBtn = new WebDriverWait(driver,5).
				until(ExpectedConditions.presenceOfElementLocated(By.id("nav-search-submit-button")));
		searchBtn.click();
	}

	public void clickBestSellers() {
		bestSellerBtn.click();
	}
	
	public void clickMobiles() {
		mobilesBtn.click();
	}

	public void clickElectronics() {
		electronicsBtn.click();
	}

	public void clickPrime() {
		PrimeBtn.click();
	}

	public void clickFashion() {
		fashionBtn.click();
	}

	public void clickFacebook() {
		facebookBtn.click();
	}

	public void clickTwitter() {
		twitterBtn.click();
	}

	public void clickInstagram() {
		instagramBtn.click();
	}
	
	
	
	
	
}
