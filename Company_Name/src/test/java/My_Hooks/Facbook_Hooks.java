package My_Hooks;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import Base.pack.Base_class;
import Pom.pack.Home_Logout;
import Utility.pack.ConfigReader;
import Utility.pack.Utility_Screen;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Facbook_Hooks 
{
	 WebDriver driver;
	Base_class gio;
	ConfigReader reader;
	Properties prop;
	Home_Logout log;
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
	
	
	@After(order=1)
	public void CloseBrowser()
	{
		driver.quit();
		
	}
	
	@After(order=2)
	public void CloseBrowseFirfoxr()
	{
		
		log=new Home_Logout(driver);
		log.accountname();
		log.clickonlogout();
	}
	
	@AfterStep
	public void Screenshots(Scenario sc) throws IOException
	{
		if(sc.isFailed()) 
		{
			Utility_Screen.screen(driver,testId);
		}
	}

}
