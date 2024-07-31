package com.groupExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {
	@Test(groups = {"TFI","Pan India"})
	public void launchingWikipediaES1() {
		Reporter.log("ExecutionScript1", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
		driver.quit();
	}
}
