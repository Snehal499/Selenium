package GenericUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtils {
	Actions actions;
	
	public ActionUtils(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	public void ClickonElement(WebElement ele) {
		actions.click(ele).perform();
	}
	
	/**
	 * 
	 * @param ele
	 * @param data
	 */
	public void passDataForElement(WebElement ele,CharSequence... data) {
		actions.sendKeys(ele,data).perform();
	}
	
	public void mouseHoverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();
	}
	
	public void doubleClickOnElement(WebElement ele) {
		actions.doubleClick(ele).perform();
	}
	
	public void rightClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
	}
	
	public void dragAndDropElement(WebElement src,WebElement dest) {
		actions.dragAndDrop(src,dest).perform();
	}
	
	public void dragAndDropElement(WebElement ele, int Xoffset, int Yoffset) {
		actions.dragAndDropBy(ele,Xoffset,Yoffset).perform();
	}
	
	public void scrollBasedOnAxis(int Xoffset, int Yoffset) {
		actions.scrollByAmount(Xoffset, Yoffset).perform();
	}
	
	public void scrollUntilElementIsVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();
	}
	
	public void scrollUntilElementIsVisible(WebElement ele, int Xoffset, int Yoffset) {
		ScrollOrigin origin=ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(origin,Xoffset,Yoffset).perform();
	}
}
