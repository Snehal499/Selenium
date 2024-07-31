package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Electronics") 
	private WebElement ElectronicsLink;
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement CameraPhotoLink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement CellPhoneLink;
	
	@FindBy(partialLinkText = "Smartphone")
	private WebElement SmartPhoneLink;
	
	@FindBy(partialLinkText = "Used phone")
	private WebElement UsedPhoneLink;
	
	@FindBy(partialLinkText = "Phone Cover")
	private WebElement PhoneCoverLink;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement AddToCartButton;

	//
	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getCameraPhotoLink() {
		return CameraPhotoLink;
	}

	public WebElement getCellPhoneLink() {
		return CellPhoneLink;
	}

	public WebElement getSmartPhoneLink() {
		return SmartPhoneLink;
	}

	public WebElement getUsedPhoneLink() {
		return UsedPhoneLink;
	}

	public WebElement getPhoneCoverLink() {
		return PhoneCoverLink;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}

	//Operational Method
		public void ShoppingCart() {
			CellPhoneLink.click();
			CameraPhotoLink.click();
			SmartPhoneLink.click();
			UsedPhoneLink.click();
			PhoneCoverLink.click();
			AddToCartButton.click();
		}
}
