package com.groupExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash {
	@Test(groups = {"KFI","Pan India"})
	public void ExecutionScript5() {
		Reporter.log("ExecutionScript5", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en.wikipedia.org/wiki/Yash_Gowda");
		driver.quit();
	}
}
