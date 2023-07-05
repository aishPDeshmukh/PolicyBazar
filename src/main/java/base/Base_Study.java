package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base_Study {

//Driver and Browser Setup

protected static WebDriver driver;   //globaly declare

public void launchBrowser()

{
	
driver=new ChromeDriver();

driver.get("https://www.policybazaar.com/");

driver.manage().window().maximize();

Reporter.log("Launching browser.", true);



}


public void closeBrowser()

{
	driver.quit();

Reporter.log("Closing Browser.", true);

}




















}
