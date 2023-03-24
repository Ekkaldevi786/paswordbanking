package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeFbPOM
{
	private WebDriver driver;
	private WebDriverWait  wait;
	
	@FindBy (xpath = "//input[@aria-label='Email address or phone number']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement Login;
	
	public HomeFbPOM(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		String kk = username.getAttribute("aria-label");
		System.out.println(kk);
		username.sendKeys("purushottamekkaldevi@rediffmail.com");
		
}
	public void sendpassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		String wr= password.getAttribute("type");
		System.out.println(wr);
		password.sendKeys("Uttam");
	}
	public void clickonlogin()
	{
		wait.until(ExpectedConditions.visibilityOf(Login));
		String fk = Login.getText();
		System.out.println(fk);
		Login.click();
	}

}
