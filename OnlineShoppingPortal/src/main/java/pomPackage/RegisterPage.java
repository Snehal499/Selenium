package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	//Declaration
		@FindBy(id="gender-male") private WebElement maleRadioButton;
		@FindBy(id="gender-female") private WebElement femaleRadioButton;
		@FindBy(id="FirstName") private WebElement FirstNameTB;
		@FindBy(id="LastName") private WebElement LastNameTB;
		@FindBy(id="Email") private WebElement EmailTextBox;
		@FindBy(id="Password") private WebElement PasswordTB;
		@FindBy(id="ConfirmPassword") private WebElement ConfirmPasswordTB;
		@FindBy(id="register-button") private WebElement RegisterButton;
		
		//Initialization
		public RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		
		//Utilization
		public WebElement getMaleRadioButton() {
			return maleRadioButton;
		}

		public WebElement getFemaleRadioButton() {
			return femaleRadioButton;
		}

		public WebElement getFirstNameTB() {
			return FirstNameTB;
		}

		public WebElement getLastNameTB() {
			return LastNameTB;
		}

		public WebElement getEmailTextBox() {
			return EmailTextBox;
		}

		public WebElement getPasswordTB() {
			return PasswordTB;
		}

		public WebElement getConfirmPasswordTB() {
			return ConfirmPasswordTB;
		}

		public WebElement getRegisterButton() {
			return RegisterButton;
		}
		
		//Operational Methods
		public void RegisterUser(String fn, String ln, String email, String pwd) {
			femaleRadioButton.click();
			FirstNameTB.clear();
			FirstNameTB.sendKeys(fn);
			
			LastNameTB.clear();
			LastNameTB.sendKeys(ln);
			
			EmailTextBox.clear();
			EmailTextBox.sendKeys(email);
			
			PasswordTB.clear();
			PasswordTB.sendKeys(pwd);
			
			ConfirmPasswordTB.clear();
			ConfirmPasswordTB.sendKeys(pwd);
			
			RegisterButton.click();
		}
}
