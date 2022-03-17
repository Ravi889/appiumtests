import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {	
  @BeforeTest
  public void abc(){
   System.out.println("..before test working fine...");	
  }
  
  @Test
  public void openCalculater() throws MalformedURLException {
	
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  System.out.println(capabilities);
	  
	  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "KFC3Y18918026853");
	  //capabilities.setCapability(MobileCapabilityType.APP, "D:\\softwareFiles\\ApiDemos-debug.apk");
        
	  capabilities.setCapability("appPackage","com.android.calculator2");
	  capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
	  	  
	  URL url = new URL("http://127.0.0.1:4723/wd/hub");	   
	  AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,capabilities);	   
	  System.out.println("Application started");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
