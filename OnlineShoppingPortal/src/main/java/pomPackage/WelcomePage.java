package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//Declaration
		@FindBy(linkText = "Register") private WebElement registerLink;
		@FindBy(linkText = "Log in") private WebElement loginlink;
		@FindBy(xpath = "//span[text()=\"Shopping cart\"]") private WebElement ShoppingLink;
		@FindBy(xpath = "//span[text()=\"Wishlist\"]") private WebElement WishlistLink;
		@FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
		@FindBy(partialLinkText = "COMPUTERS") private WebElement computersLink;
		@FindBy(partialLinkText = "ELECTRONICS") private WebElement electonicsLink;
		@FindBy(partialLinkText = "APPAREL & SHOES") private WebElement apparelShoesLink;
		@FindBy(partialLinkText = "DIGITAL DOWNLOADS") private WebElement digitalDowmnloadslink;
		@FindBy(partialLinkText = "JEWELRY") private WebElement jewelry;
		@FindBy(partialLinkText = "GIFT CARDS") private WebElement giftCardsLink;
		@FindBy(id="small-searchterms\"") private WebElement searchBox;
		@FindBy(xpath = "//input[@type=\"submit\"]") private WebElement searchButton;

		//Initialization
		public WelcomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// Utilization
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


		public WebElement getBooks() {
			return booksLink;
		}


		public WebElement getComputers() {
			return computersLink;
		}
		

		public WebElement getElectonics() {
			return electonicsLink;
		}


		public WebElement getApparelShoes() {
			return apparelShoesLink;
		}


		public WebElement getDigitalDowmnloads() {
			return digitalDowmnloadslink;
		}


		public WebElement getJewelry() {
			return jewelry;
		}


		public WebElement getGiftCards() {
			return giftCardsLink;
		}


		public WebElement getSearchBox() {
			return searchBox;
		}
		

		public WebElement getSearchButton() {
			return searchButton;
		}

}
