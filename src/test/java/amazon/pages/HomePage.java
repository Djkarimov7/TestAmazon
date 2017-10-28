package amazon.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import amazon.utilities.Config;
import amazon.utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private  WebDriver driver;

	public HomePage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="//span[@class='nav-logo-base nav-sprite']")
	WebElement amazonLogo;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']/span[1]")
	WebElement signInStatus;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement acct_Lists1;
	
	@FindBy(xpath="//span[contains(text(),'Account & Lists')][1]")
	WebElement acct_Lists2;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),' Sign Out ')]")
	WebElement logout;
	
	@FindBy(xpath=".//*[@id='nav-al-your-account']/a[20]/span")
	WebElement logout1;
	
	public void verifySignIn(){
		
		String expPerson=null;
		String signInPerson=signInStatus.getAttribute("value");
		System.out.println(signInPerson);
		
		if(!signInPerson.equals(expPerson)){
			Actions act= new Actions(driver);
			act.moveToElement(acct_Lists2).perform();
			logout.click();

	}
	
	}
	

	
}

//	@BeforeMethod
//	public void stepOne(){
//		try {
//			System.setProperty("webdriver.chrome.driver", "/Users/djamshedkarimov/Documents/Libraries/drivers/chromedriver");
//			driver= new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	@Test
//	public void testOne(){
//		try {
//			driver.get("https://amazon.com/");
//			String title=driver.getTitle();
//			System.out.println("this is the page title: "+title);
//			String expTitle="Emazon.com";
//			if(!title.contains(expTitle)){
//				Assert.fail("This is the wrong title.");
//			    driver.close();
//			}else{
//				System.out.println("Title matched.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	@AfterMethod
//	public void tearDown(){
//		try {
//			Thread.sleep(15000);
//			driver.quit();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//	}
	

