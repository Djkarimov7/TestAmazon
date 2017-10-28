package amazon.pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import amazon.utilities.Config;
import amazon.utilities.Driver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="ap_email")
	WebElement loginEmail;
	
	@FindBy(id="ap_password")
	WebElement loginPwd;
	
	@FindBy(how=How.ID, using="signInSubmit")
	WebElement submitBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
//	@FindBy(id="")
//	WebElement ;
//	
//	@FindBy(id="")
//	WebElement ;
	
	public void signIn(){
		
		HomePage hp= new HomePage();
		Actions act= new Actions(driver);
		act.moveToElement(hp.acct_Lists2).click().build().perform();
		
		loginEmail.sendKeys(Config.getProperty("userEmail"));
		loginPwd.sendKeys(Config.getProperty("userPwd"));
		//checkbox.click();
		if(checkbox.isSelected()){
			checkbox.click();
			assertFalse(checkbox.isSelected());
			System.out.println("Checkbox is not selected");
		}
		submitBtn.click();
	}
	
}
