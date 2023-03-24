package com.AmazonStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Steps
{
	WebDriver driver;
	
	@Given("user is on Amazon page")
	public void user_is_on_amazon_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	    
	}

	@When("user click on account section")
	public void user_click_on_account_section() 
	{
		WebElement account = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		account.click();
		String a = account.getText();
		System.out.println(a);
	   
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() 
	{
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		signin.click();
		String b = signin.getText();
		System.out.println(b);
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password()
	{
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("9422549123");
		
		WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
		con.click();
		String c=con.getText();
		System.out.println(c);
		
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Uttam@123");
	}

	@When("click on login button")
	public void click_on_login_button()
	{
		WebElement log= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		log.click();
		String k= log.getText();
		System.out.println(k);
		
		WebElement log1= driver.findElement(By.xpath("//input[@id='auth-signin-button']"));
		log1.click();
	}

	@Then("user should land on Home page")
	public void user_should_land_on_home_page() 
	{
		WebElement Home= driver.findElement(By.xpath("//span[text()='Hello, Purushottam']"));
		String p= Home.getText();
		System.out.println(p);
		
		String nk = driver.getCurrentUrl();
		System.out.println(nk);
		
		String nkk = driver.getTitle();
		System.out.println(nkk);
		
		
	}


}
