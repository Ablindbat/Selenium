package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SeleniumAssignment.pages.HomePage;

public class HomeTest extends BaseTest{
	
	@Test(groups = {"sanity","top"})
	@Parameters({"searchText"})
	public void enterSearchText(String searchText) {
		et=er.startTest("Search Test Case.");
		HomePage hp = new HomePage(driver);
		hp.enterSearchText(searchText);
		hp.clickSearchIcon();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone");
	}

	@Test(groups = {"sanity","top"})
	public void navigationBarBestSellerClickTest() {
		
		et=er.startTest("Navigation Bar Click Test.");
		HomePage hp = new HomePage(driver);
		hp.clickBestSellers();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Bestsellers: The most popular items on Amazon");
	}
	@Test(groups = {"sanity","top"})
	public void navigationBarMobilesClickTest() {
		
		et=er.startTest("Mobile Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickMobiles();
		Assert.assertEquals(driver.getTitle(), "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
	}
	@Test(groups = {"sanity","top"})
	public void navigationBarElectronicsClickTest() {
		
		et=er.startTest("Electronics Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickElectronics();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Bestsellers: The most popular items on Amazon");
	}
	@Test(groups = {"sanity","top"})
	public void navigationBarPrimeClickTest() {
		
		et=er.startTest("Prime Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickPrime();
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Amazon Prime");
	}
	@Test(groups = {"sanity","top"})
	public void navigationBarFashionClickTest() {
		
		et=er.startTest("Fashion Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickFashion();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Bestsellers: The most popular items on Amazon");
	}
	
	@Test(groups = {"sanity","footer"})
	public void contectWithUsFacebookClickTest() {
		
		et=er.startTest("Facebook Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickFacebook();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Amazon India - Home | Facebook");
		sa.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/AmazonIN");
		sa.assertAll();
	}
	@Test(groups = {"sanity","footer"})
	public void contectWithUsTwitterClickTest() {
		
		et=er.startTest("Twitter Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickTwitter();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 Assert.assertEquals(driver.getTitle(), "Amazon India (@amazonIN) / Twitter");
	}
	
	@Test(groups = {"sanity","footer"})
	public void contectWithUsInstagramClickTest() {
		
		et=er.startTest("Instagram Test Case.");
		HomePage hp = new HomePage(driver);
		hp.clickInstagram();
		Assert.assertEquals(driver.getTitle(), "Amazon India (@amazondotin) • Instagram photos and videos");
	}
	

}
