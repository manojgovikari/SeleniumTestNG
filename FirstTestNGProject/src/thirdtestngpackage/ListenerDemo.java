package thirdtestngpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(thirdtestngpackage.ListenerTest.class)
@Listeners(value=thirdtestngpackage.Reporter.class)

public class ListenerDemo {
	
	public WebDriver driver;
	
  @Test
  public void Login() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\Desktop\\OFFICE PROJECT WORK\\Java_selenium_Documentation_Setup\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    Reporter.log("opening guru site");
	  driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr263158");		
	    Reporter.log("entered userid");
	    driver.findElement(By.name("password")).sendKeys("mYpEbUd");	
	    Reporter.log("entered password");
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}	
}
