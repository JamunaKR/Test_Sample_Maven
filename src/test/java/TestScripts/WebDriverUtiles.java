package TestScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic.JavaUtils;

/**
 * 
 * @author RiChi
 *
 */
public class WebDriverUtiles {

    JavaUtils jLib=new JavaUtils();
	

	/**
	 * used to select the option from the dropdown based on visible text
	 * @param element
	 * @param visibleText
	 */
	public void select(WebElement element, String visibleText) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	/**
	 * used to select the option based on position/index (index always starts from 0)
	 * @param element
	 * @param index
	 */
	public void select (WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);	
	}
	/**
	 * used to wait for element to be clickable in GUI & check for the element for every 500ms
	 * @param driver
	 * @param element 
	 */
	public void waitforElementToBeclickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * wait for DOM document to be load before finding any element in GUI 
	 * @param driver
	 */
	public void waitforHTMLDOM(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	/**
	 * Switch to Required Window based on title Parameter
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver,String partialWindowTitle) {
		/*get all window session*/
		Set<String> set=driver.getWindowHandles();
		Iterator<String>it=set.iterator();
		
		while(it.hasNext()) {
			String winID=it.next();
			driver.switchTo().window(winID);
			String actTitle=driver.getTitle();
			if (actTitle.contains(partialWindowTitle)) {
				System.out.println("switched to actual window");
				break;
			}
		}
			
	}
	/**
	 * used to switch to Alert Popup and click on OK button
	 * @param driver
	 */
	public void alertOK(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * used to switch to Alert Popup and click on Cancel button
	 * @param driver
	 */
	public void alertCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * used to take mouse cursor on expected element on the browser
	 * @param driver
	 * @param element 
	 */
	public void moveToExpectedElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
public void switchToFrame(WebDriver driver, WebElement element) {
	driver.switchTo().frame(element);
}
public void switchToFrame(WebDriver driver, String id, String name) {
	WebElement fwb;
	if(id!=null) {
		driver.switchTo().frame(id);
	}
	else {
		driver.switchTo().frame(name);
	}
}
}
