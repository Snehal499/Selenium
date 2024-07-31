package GenericUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseClass {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Declaration
	@FindBy(linkText = "Register") 
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(xpath = "//span[text()=\"Shopping cart\"]") 
	private WebElement ShoppingLink;
	
	@FindBy(xpath = "//span[text()=\"Wishlist\"]") 
	private WebElement WishlistLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS") 
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electonicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES") 
	private WebElement apparelShoesLink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDowmnloadslink;
	
	@FindBy(partialLinkText = "JEWELRY") 
	private WebElement jewelry;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(id="small-searchterms\"") 
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement searchButton;

	
	//Utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingLink() {
		return ShoppingLink;
	}

	public WebElement getWishlistLink() {
		return WishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectonicsLink() {
		return electonicsLink;
	}

	public WebElement getApparelShoesLink() {
		return apparelShoesLink;
	}

	public WebElement getDigitalDowmnloadslink() {
		return digitalDowmnloadslink;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
