package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Logout 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//div[@aria-label='Your profile']")
	private WebElement account;
	
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement logout;
	
	
	public Home_Logout (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void accountname()
	{
		wait.until(ExpectedConditions.visibilityOf(account));
		account.click();
	}
	public void clickonlogout()
	{
		wait.until(ExpectedConditions.visibilityOf(logout));
		 logout.click();
	}

}
