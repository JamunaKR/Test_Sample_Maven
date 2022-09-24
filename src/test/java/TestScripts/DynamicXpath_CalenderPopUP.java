package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic.JavaUtils;

public class DynamicXpath_CalenderPopUP {
	JavaUtils javalib=new JavaUtils(); 
	
	@Test
	public void bookTicket() {
		String date=javalib.getDate();
		int month=javalib.getMonthInt();
		String year=javalib.getCurrentYear();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		//driver.findElement(By.id("FromTag")).sendKeys("BLR");
		//driver.findElement(By.xpath("//a[text()='Bangalore, IN - Kempegowda International Airport (BLR)")).click();
		
		//driver.findElement(By.id("ToTag")).sendKeys("GOI");
		//driver.findElement(By.xpath("//a[text()='Goa, IN - Dabolim Airport (GOI)")).click();
		
		driver.findElement(By.id("FromTag")).sendKeys("BLR");
		driver.findElement(By.xpath("//a[contains(text(),'BLR')]")).click();

		driver.findElement(By.id("ToTag")).sendKeys("GOI");
		driver.findElement(By.xpath("//a[contains(text(),'GOI')]")).click();

		driver.findElement(By.xpath("//td[@data-month="+month+" and @data-year='"+year+"']/a[text()='"+date+"']")).click();

		driver.close();


		
		}
}
