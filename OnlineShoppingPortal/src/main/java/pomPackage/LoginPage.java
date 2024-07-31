package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		//Declaration
		@FindBy(partialLinkText = "Log in") private WebElement LoginLink1;
		@FindBy(id="Email") private WebElement EmailTB;
		@FindBy(id="Password") private WebElement PasswordTB;
		@FindBy(id="RememberMe") private WebElement rememberMeCheckBox;
		@FindBy(xpath = "//input[@value='Log in']") private WebElement LogInButton;

		//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Utilization
		public WebElement getEmailTB() {
			return EmailTB;
		}

		public WebElement getPasswordTB() {
			return PasswordTB;
		}

		public WebElement getRememberMeCheckBox() {
			return rememberMeCheckBox;
		}

		public WebElement getLogInButton() {
			return LogInButton;
		}
		
		public WebElement getLoginLink() {
			return LoginLink1;
		}
		
		//Operational Method
		public void RegisterUser(String email, String pwd) {
			LoginLink1.click();
			
			EmailTB.clear();
			EmailTB.sendKeys(email);
			
			PasswordTB.clear();
			PasswordTB.sendKeys(pwd);
			
			LogInButton.click();
		}

		
}
