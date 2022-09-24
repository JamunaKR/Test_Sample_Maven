package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FaceBookAssign {
	
	@Test
	public void remoteExe() throws MalformedURLException, InterruptedException
	{
		URL url=new URL("http://192.168.43.179:4444/wd/hub");//should consider the client IP address(not node IP)
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		Thread.sleep(5000);
		cap.setBrowserName("firefox");
	
		
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
	}

}
