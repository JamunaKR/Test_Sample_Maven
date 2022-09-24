package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public void bookTicket() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
	}

}
