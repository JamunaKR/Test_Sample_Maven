package TestScripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicXpath_MakeMyTrip {
	@Test
	public void TicketBook() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("blr");
		driver.findElement(By.xpath("//a[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.id("ToTag")).sendKeys("goi");
		driver.findElement(By.xpath("//a[.='Goa, IN - Dabolim Airport (GOI)']")).click();
		//driver.findElement(By.xpath("//td[@data-month='2' and @data-year='2021']/a[text()='22']")).click(); Becz we have to change the date everyday
		
	}

}
