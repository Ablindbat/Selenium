package com.SeleniumAssignment.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static String takeScreenshot(WebDriver driver , String name) {
		String screenshotPath = System.getProperty("user.dir")+"/FailedScreenshots/"+name+"_Invalid_Credentials.jpg";
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		try {
			FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshotPath;
	}
}
