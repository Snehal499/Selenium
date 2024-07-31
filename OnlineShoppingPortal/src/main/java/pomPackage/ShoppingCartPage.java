package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//Declaration
		@FindBy(xpath = "//input[@name='itemquantity4441458']") private WebElement QtyTextBox;
		@FindBy(xpath = "//input[@name='removefromcart']") private WebElement RemoveCheckBox;
		@FindBy(partialLinkText = "Smartphone") private WebElement SmartphoneLink;
		@FindBy(xpath = "//input[@name='updatecart']") private WebElement UpdateCartButton;
		@FindBy(xpath = "//input[@name='continueshopping']") private WebElement ContinueShoppingButton;
		@FindBy(id="termsofservice") private WebElement TermsOfServiceCB;
		@FindBy(id="checkout") private WebElement CheckoutButton;
		
	//Initialization
		public ShoppingCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Utilization
		public WebElement getQtyTextBox() {
			return QtyTextBox;
		}
		public WebElement getRemoveCheckBox() {
			return RemoveCheckBox;
		}
		public WebElement getUpdateCartButton() {
			return UpdateCartButton;
		}
		public WebElement getContinueShoppingButton() {
			return ContinueShoppingButton;
		}
		public WebElement getTermsOfServiceCB() {
			return TermsOfServiceCB;
		}
		public WebElement getCheckoutButton() {
			return CheckoutButton;
		}
		
		public WebElement getSmartphoneLink() {
			return SmartphoneLink;
		}

		//Operational Methods
		public void User(String qty) {
			QtyTextBox.clear();
			QtyTextBox.sendKeys(qty);
			
			RemoveCheckBox.click();
			UpdateCartButton.click();
			TermsOfServiceCB.click();
			CheckoutButton.click();
		}	
}
