package GenericUnits;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToWindowBasedOnTitle(String Title) {
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals(Title)) {
				break;
			}
		}
	}
	
	public void switchToWindowBasedOnURL(String url) {
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().equals(url)) {
				break;
			}
		}
	}
	
	public void switchToAlertAndClickOnOK() {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndClickOnCancle() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public void passValueForAlertTextBox(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void switchToDefaultFrame() {
		driver.switchTo().defaultContent();
	}
}
