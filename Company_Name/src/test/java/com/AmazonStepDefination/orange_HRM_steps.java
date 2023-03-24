package com.AmazonStepDefination;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Base.pack.Base_class;
import Pom.pack.HomeLoginPage;
import Pom.pack.Home_Logout;
import Pom.pack.orangeLogout;
import Pom.pack.orangePOM;
import Utility.pack.ConfigReader;
import Utility.pack.Utility_Screen;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orange_HRM_steps
{
	WebDriver driver;
	orangePOM lot;
	Base_class gio;
	ConfigReader reader;
	Properties prop;
	orangeLogout out;
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
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	}
	
	@Given("user is on orangeHRM Login page")
	public void user_is_on_orangeHRM_Login_page() 
	{
		
		testId=01;
		
		
		String hk=driver.getCurrentUrl();
		System.out.println(hk);
		
		String pk=driver.getTitle();
		System.out.println(pk);
	    
	}

	@When("user enters orangeHRM Login use {string}")
	public void user_enters_orangeHRM_Login_use(String Username) 
	{
		testId=02;
		orangePOM lot=new orangePOM(driver);
		lot.sendusernameor(Username);
	    
	}

	@When("user enters orangeHRM Login pwd {string}")
	public void user_enters_orangeHRM_Login_pwd (String Password) 
	{
		testId=03;
		orangePOM lot=new orangePOM(driver);
		lot.sendpasswordor(Password);
		
	    
	}

	@When("user click on orangeHRM login button")
	public void user_click_on_orangeHRM_login_button() 
	{
		testId=04;
		
		orangePOM lot=new orangePOM(driver);
		lot.clickonloginButtonor();
	    
	}

	@Then("user should be navigate to orangeHRM Login HomePage")
	public void user_should_be_navigate_to_orangeHRM_Login_HomePage() 
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
		
		orangeLogout out=new orangeLogout(driver);
		out.accountnameor();
		out.clickonlogoutor();
		
		
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
