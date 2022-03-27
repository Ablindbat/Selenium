package com.SeleniumAssignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPage {
	
	WebDriver driver;
	public CareersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Careers']")
	public WebElement careersBtn;
	
	public void clickCareersBtn() {
		careersBtn.click();
	}
		

	public void clickStudentJobBtn() {
		WebElement studentsJobBtn = new WebDriverWait(driver,10).
				until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//a[@href='/business_categories/student-programs']")));
		studentsJobBtn.click();
	}

}
