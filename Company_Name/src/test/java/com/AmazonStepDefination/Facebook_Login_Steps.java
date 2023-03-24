package com.AmazonStepDefination;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Base.pack.Base_class;
import Pom.pack.HomeFbPOM;
import Pom.pack.HomeLoginPage;
import Pom.pack.Home_Logout;
import Utility.pack.ConfigReader;
import Utility.pack.Utility_Screen;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook_Login_Steps 
{
	WebDriver driver;
	HomeLoginPage login;
	Base_class gio;
	ConfigReader reader;
	Properties prop;
	Home_Logout logn;
	int testId;
	
	@Before(order=1)
	public void LaunchBrowser() throws IOException
	{
		reader = new ConfigReader();
		prop = reader.init_prop();
	
	}
	
	@Before(order=2)
	public void LaunchBrowserChrome()
	{
		
		String browsername = prop.getProperty("browser");
		gio = new Base_class();
		driver=gio.openchromebrowser(browsername);
		driver.get("https://www.facebook.com/login");
		
		
	}
	
	@Given("user is on Facebook Lgin page")
	public void user_is_on_Facebook_Lgin_page() 
	{
		
		testId=01;
		
		
		String hk=driver.getCurrentUrl();
		System.out.println(hk);
		
		String pk=driver.getTitle();
		System.out.println(pk);
	    
	}

	@When("user enters Facebook Login {string}")
	public void user_enters_Facebook_Login(String Username) 
	{
		testId=02;
		HomeLoginPage login=new HomeLoginPage(driver);
		login.sendusernameFb(Username);
	    
	}

	@When("user enters Facebook Login pwd {string}")
	public void user_enters_Facebook_Login_pwd (String Password) 
	{
		testId=03;
		HomeLoginPage login=new HomeLoginPage(driver);
		login.sendpasswordFb(Password);
		
	    
	}

	@When("user click on Facebook login button")
	public void user_click_on_Facebook_login_button() 
	{
		testId=04;
		
		HomeLoginPage login=new HomeLoginPage(driver);
		login.clickonloginButton();
	    
	}

	@Then("user should be navigate to Facebbok Login HomePage")
	public void user_should_be_navigate_to_Facebook_Login_HomePage() 
	{
		testId=05;
		
		String gk=driver.getCurrentUrl();
		System.out.println(gk);
		
		String lk=driver.getTitle();
		System.out.println(lk);
	    
	}
	
	@After(order=2)
	public void CloseBrowser(Scenario sc)
	{
		
		Home_Logout logn=new Home_Logout(driver);
		logn.accountname();
		logn.clickonlogout();
		
	}
	
	@After(order=1)
	public void CloseBrowseFirfoxr(Scenario sc) throws IOException
	{
		
		if(sc.isFailed()) 
		{
		
			Utility_Screen.screen(driver,testId);
		}
		driver.quit();
		
	}
	
	
	

}
