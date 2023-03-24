package com.AmazonStepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Base.pack.Base_class;

import Pom.pack.HomeFbPOM;
import Pom.pack.Home_Logout;
import Pom.pack.marketplace;
import Utility.pack.ConfigReader;
import Utility.pack.Utility_Screen;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBSteps
{
	WebDriver driver;
	HomeFbPOM logs;
	Base_class gio;
	ConfigReader reader;
	Properties prop;
	Home_Logout logn;
	int testId;
	marketplace market;
	
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
	
	@Given("User should be on Marketplace page")
	public void user_should_be_on_marketplace_page() 
	{
		String hkk=driver.getCurrentUrl();
		System.out.println(hkk);
		
		String pkk=driver.getTitle();
		System.out.println(pkk);
	}

	@When("User click on Marketplace button")
	public void user_click_on_marketplace_button() 
	{
		marketplace market=new marketplace(driver);
		market.clickmarket();
	}

	@When("User search the Car")
	public void user_search_the_car()
	{
		marketplace market=new marketplace(driver);
		market.searchfield();
	}

	@Then("User should be on car page")
	public void user_should_be_on_car_page()
	{
		String gkk=driver.getCurrentUrl();
		System.out.println(gkk);
		
		String lkk=driver.getTitle();
		System.out.println(lkk);
	   
	}
	
	
	@Given("user is on FB page")
	public void user_is_on_fb_page() 
	{
		
		testId=01;
		
		
		String hk=driver.getCurrentUrl();
		System.out.println(hk);
		
		String pk=driver.getTitle();
		System.out.println(pk);
	    
	}

	@When("user enters FB Username")
	public void user_enters_fb_username() 
	{
		testId=02;
		HomeFbPOM logs=new HomeFbPOM(driver);
		logs.sendusername();
	    
	}

	@When("user enters FB Passord")
	public void user_enters_fb_passord() 
	{
		testId=03;
		logs=new HomeFbPOM(driver);
		logs.sendpassword();
		
	    
	}

	@When("user click on FB login button")
	public void user_click_on_fb_login_button() 
	{
		testId=04;
		
		logs=new HomeFbPOM(driver);
		logs.clickonlogin();
	    
	}

	@Then("user should be navigate to FB HomePage")
	public void user_should_be_navigate_to_fb_home_page() 
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
