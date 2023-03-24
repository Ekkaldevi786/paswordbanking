package com.AmazonStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps
{
	WebDriver driver;
	int testId;
	
	@Given("user is on Facebook page")
	public void user_is_on_facebook_page() 
	{
		testId=01;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
	    
	}

	@When("user enters Username")
	public void user_enters_username()
	{
		testId=02;
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		username.sendKeys("purushottamekkaldevi@rediffmail.com");
		String fb=username.getAttribute("aria-label");
		System.out.println(fb);
	    
	}

	@When("user enters Passord")
	public void user_enters_passord()
	{
		testId=03;
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Uttam@123");
		String fb1=password.getAttribute("type");
		System.out.println(fb1);
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		testId=04;
		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		login.click();
		String jk=login.getText();
		System.out.println(jk);
	   
	}

	@Then("user should be navigate to HomePage")
	public void user_should_be_navigate_to_home_page() 
	{
		testId=05;
		String pk=driver.getCurrentUrl();
		System.out.println(pk);
		
		String kl= driver.getTitle();
		System.out.println(kl);
		
		driver.close();
	    
	}


}
