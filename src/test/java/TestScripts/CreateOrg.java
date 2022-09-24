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

public class CreateOrg {
	JavaUtils jLib=new JavaUtils();
	WebDriverUtiles wLib=new WebDriverUtiles();
	
	@Test
	public void createOrg() {
		/*Common Data */
		int randomNum=jLib.gernerateRandomNum();
		String userName="admin";
		String password="admin";
		String url="http://localhost:8888/";
		String browser="firefox";
		
		/*test Data*/
		String orgName="Furry"+randomNum;
		String orgType="Analyst";
		String orgIndustry="Banking";
		
		String ConstLastName="Jamuna_"+randomNum;
		
		/*Step 1: Login to app */
		WebDriver driver=new FirefoxDriver();
		wLib.waitforHTMLDOM(driver);
		driver.get(url);
		
		driver.findElement(By.name("user_name")).sendKeys(userName);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		/*Step 2: navigate to organization page */
		driver.findElement(By.linkText("Organizations")).click();
		
		/*step 3: navigate to create Org page */
		wLib.waitforElementToBeclickable(driver, driver.findElement(By.xpath("//img[@alt='Create Organization...']")));
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		/*step 4: Create new Org with industry & type, rating */
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		wLib.select(driver.findElement(By.name("industry")), orgIndustry);
		//wLib.sele
	}

}
