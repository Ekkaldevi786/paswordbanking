package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeLogout 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//a[text()='Welcome Paul']")
	private WebElement account;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	public orangeLogout(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void accountnameor()
	{
		wait.until(ExpectedConditions.visibilityOf(account));
		account.click();
	}
	public void clickonlogoutor()
	{
		wait.until(ExpectedConditions.visibilityOf(logout));
		 logout.click();
	}

}
