package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	//Declaration
	@FindBy(xpath = "//input[@name='itemquantity4441460']") private WebElement QtyTextBox;
	@FindBy(xpath = "//input[@name='removefromcart']") private WebElement RemoveCheckBox;
	@FindBy(xpath = "//input[@name='addtocart']") private WebElement AddToCartCheckBox;
	@FindBy(xpath = "//input[@name='updatecart']") private WebElement UpdateCartButton;
	@FindBy(xpath = "//input[@name='addtocartbutton']") private WebElement AddToCartButton;
	@FindBy(xpath = "//input[@value='Email a friend']") private WebElement EmailFriendButton;
	
	//Initialization
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getQtyTextBox() {
		return QtyTextBox;
	}
	public WebElement getRemoveCheckBox() {
		return RemoveCheckBox;
	}
	public WebElement getAddToCartCheckBox() {
		return AddToCartCheckBox;
	}
	public WebElement getUpdateCartButton() {
		return UpdateCartButton;
	}
	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	public WebElement getEmailFriendButton() {
		return EmailFriendButton;
	}

	//Operational Methods
	public void user(String qty) {
		QtyTextBox.clear();
		QtyTextBox.sendKeys(qty);
		
		RemoveCheckBox.click();
		AddToCartCheckBox.click();
		UpdateCartButton.click();
		AddToCartButton.click();
		EmailFriendButton.click();
	}

}
