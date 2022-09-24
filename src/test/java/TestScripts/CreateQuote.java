package TestScripts;

import org.testng.annotations.Test;

import Generic.JavaUtils;

/**
 * 
 * @author RiChi
 *
 */

public class CreateQuote {
	
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
		
		/*test Data*/
		String orgName="Snipper_"+randomNum;
		String orgType="Advertisement";
		String orgIndustry=""
	}

}
