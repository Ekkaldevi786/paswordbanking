package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangePOM
{
	private WebDriver driver;
	private WebDriverWait  wait;
	
	@FindBy (xpath = "//input[@name='txtUsername']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='txtPassword']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement Login;
	
	public orangePOM(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void sendusernameor(String Username)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		String kk = username.getAttribute("name");
		System.out.println(kk);
		username.sendKeys(Username);
		
}
	public void sendpasswordor(String Password)
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		String wr= password.getAttribute("name");
		System.out.println(wr);
		password.sendKeys(Password);
	}
	public void clickonloginButtonor()
	{
		wait.until(ExpectedConditions.visibilityOf(Login));
		String fk = Login.getAttribute("type");
		System.out.println(fk);
		Login.click();
	}

}
