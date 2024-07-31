package GenericUnits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import pomPackage.ElectronicsPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;

public class BaseClass implements IAutoConstants, ITestListener {
	public static WebDriver driver;    //WD make static to not get ts is null for listener to work//static will create ref of WD & use in @listener
	public FileLibrary flib;
	public LoginPage lp;
	public BasePage bp;
	public ElectronicsPage ep;
	public ShoppingCartPage sp;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}
	
	@BeforeClass
	public void LaunchingBrowser(@Optional("chrome") String browserName) {
		
		Reporter.log("Before Class", true);
		if (browserName.equalsIgnoreCase("chrome")) 
			driver=new ChromeDriver();
		else if (browserName.equalsIgnoreCase("firefox")) 
			driver=new FirefoxDriver();
		else if (browserName.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		lp=new LoginPage(driver);
		flib=new FileLibrary();
		bp=new BasePage(driver);
		ep= new ElectronicsPage(driver);
		sp=new ShoppingCartPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
	}
	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("Before Method", true);
		driver.get(flib.fatchDataFromProperties(PropertyFilePath,"url"));
		lp.getLoginLink().click();
		lp.getEmailTB().sendKeys(flib.fatchDataFromProperties(PropertyFilePath, "email"));
		lp.getPasswordTB().sendKeys(flib.fatchDataFromProperties(PropertyFilePath, "password"));
		lp.getLogInButton().click();
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method", true);
	}
	
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("After Class", true);
		driver.close();
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite", true);
	}
	
	//Listener
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(ScreenshotPath+"screenshot.png");
		try {
			FileHandler.copy(src, dest);
		}
		catch (IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
}
