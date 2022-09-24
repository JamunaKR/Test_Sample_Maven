package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbRemote {
			RemoteWebDriver driver;
	
		  public static final String USERNAME = "jamunakr1";
		  public static final String AUTOMATE_KEY = "7RPZkzxz5Gz5KwSgBpTY";
		  public static final String url = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		  public void browser() throws MalformedURLException, InterruptedException
		  {
			  DesiredCapabilities cap=new DesiredCapabilities();	//to set the capabilities or platforms
			  cap.setPlatform(Platform.WINDOWS);
			  cap.setBrowserName("chrome");
			  cap.setVersion("80");
			  cap.setCapability("name", "Jamuna");
		  
		  	driver = new RemoteWebDriver(new URL(url),cap);
		    driver.get("https://www.facebook.com");
		    Thread.sleep(2000);
		    driver.quit();
		    
		  }
}
