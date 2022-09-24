package TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic.JavaUtils;

/**
 * 
 * @author RiChi
 *
 */

public class CreateLead {
	
	JavaUtils jLib=new JavaUtils();
	WebDriverUtiles wLib=new WebDriverUtiles();
	
	@Test
	public void createQuoteTest()
	{
		/*common Data */
		int randomNum=jLib.gernerateRandomNum();
		String userName="admin";
		String password="admin";
		String url="http://localhost:8888";
		String browser="firefox";
		
		/*Step1: Login to App*/
		WebDriver driver=new FirefoxDriver();
		wLib.waitforHTMLDOM(driver);
		driver.get(url);
		
		driver.findElement(By.name("user_name")).sendKeys(userName);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		/*step 2: navigate to Leads page*/
		driver.findElement(By.linkText("Leads")).click();
		
		/*step 3: create new Lead */
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		
		/*Step 4: create new Lead modules */
		driver.findElement(By.name("lastname")).sendKeys("Jessy");
		driver.findElement(By.name("company")).sendKeys("LeadsInc");
		driver.findElement(By.xpath("//select[@name='leadsource']"));
		
		/*step 5: */
		
	}		

}
