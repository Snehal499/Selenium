package GenericUnits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtils {
	WebDriver driver;
	JavascriptExecutor js;
	
	public JavaScriptUtils(WebDriver driver) {
		this.driver = driver;     // store current address of object / keyword & variable
		js=(JavascriptExecutor) driver;
	}
	


}
