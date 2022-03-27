package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.CareersPage;

public class CareersTest extends BaseTest{
	
	@Test(groups = {"sanity","careers"})
	 
	public void careersSearchJobTest() {
		
		et = er.startTest("Career Job Search Test Case.");
		CareersPage cp = new CareersPage(driver);
		cp.clickCareersBtn();
		Assert.assertEquals(driver.getTitle(), "Amazon.jobs: Help us build Earth’s most customer-centric company.");
		cp.clickStudentJobBtn();
		Assert.assertEquals(driver.getTitle(), "Student Programmes | Amazon.jobs");
	}

}
