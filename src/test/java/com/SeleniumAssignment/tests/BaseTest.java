package com.SeleniumAssignment.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.SeleniumAssignment.Screenshot.Screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest {
	
	static WebDriver driver;
	static File file = new File("./Resources/read.properties");
	static FileInputStream fiStream = null;
	static Properties prop = new Properties();
	public static ExtentReports er;
	public static ExtentTest et;
	
	
	static {
		try {
		fiStream = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			prop.load(fiStream);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeSuite(groups = {"sanity"})
	public static void setExtentReport(){
		er = new ExtentReports("./Reports/extentReport.html");
	}
	@AfterSuite(groups = {"sanity"})
	public static void endTest() {
		er.flush();
		er.close();
	}
	
	@AfterMethod(groups = {"sanity"})
	public void attachScreenshot(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = Screenshot.takeScreenshot(driver, result.getName());
			et.log(LogStatus.FAIL, et.addScreenCapture(screenshotPath));
			er.endTest(et);
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			et.log(LogStatus.PASS, "Test Case Passed.");
			er.endTest(et);
		}
	}
	
	@Parameters("BrowserName")
	@BeforeMethod(groups = {"sanity"})
	public static void initializationBrowsers(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("DriverPropertyForChrome"),prop.getProperty("ChromeDriverPath"));
			ChromeOptions option  = new ChromeOptions();
			option.addArguments("--headless");
			driver = new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty(prop.getProperty("DriverPropertyForEdge"),prop.getProperty("EdgeDriverPath"));
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty(prop.getProperty("DriverPropertyForFirefox"),prop.getProperty("FirefoxDriverPath"));
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	@BeforeMethod(groups = {"sanity"})
	public void urlLunch() {
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod(groups = {"sanity"})
	public void close() {
		driver.close();
		System.out.println("Complete.");
	}
	
	

}
