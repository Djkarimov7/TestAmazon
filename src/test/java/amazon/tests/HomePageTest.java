package amazon.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amazon.pages.HomePage;
import amazon.pages.LoginPage;
import amazon.utilities.Config;

import amazon.utilities.Driver;
import amazon.utilities.Page;

public class HomePageTest {

	WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		 driver=Driver.getInstance();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get(Config.getProperty("url"));
		 driver.manage().window().maximize();
		 Page.sleep(5000);
		 
	}
	
	@Test(dependsOnMethods="test1")
	public void test(){
		HomePage hp1 =new HomePage();
		hp1.verifySignIn();
	}
	
	@Test
	public void test1(){
		LoginPage obj1 = new LoginPage();
		obj1.signIn();
		}
	
	@AfterClass
	public void tearDown(){
		//Driver.closeDriver();
	}
}
