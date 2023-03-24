package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class marketplace
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//a[@aria-label='Marketplace']")
	private WebElement market;
	
	@FindBy (xpath = "(//input[@aria-label='Search Marketplace'])[2]")
	private WebElement search;
	
	
	public  marketplace (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void clickmarket()
	{
		wait.until(ExpectedConditions.visibilityOf(market));
		market.click();
	}
	public void searchfield()
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		String wk= search.getAttribute("aria-label");
		System.out.println(wk);
		search.sendKeys("Indica" + Keys.ENTER);
	}

}


