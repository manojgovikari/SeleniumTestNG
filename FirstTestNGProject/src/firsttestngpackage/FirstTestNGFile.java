package firsttestngpackage;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
//Git push test from local after cloning
public class FirstTestNGFile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\Manoj\\Desktop\\OFFICE PROJECT WORK\\Java_selenium_Documentation_Setup\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
    Logger log = Logger.getLogger("devpinoyLogger");
 
    
    @Test(priority=1)
    public void Test1_Pass() {
    	log.info("Test1_passed");
    	Assert.assertTrue(true);
    }
    @Test(priority=2)
    public void Test2_Fail() {
    	log.error("Test2 - Failed");
    	Assert.assertTrue(false);
    }
    @Test(priority=0)
    public void Test3_Skip() {
    	log.warn("Test3 - skipped");
    	throw new SkipException("Skipping Test3 method");
    }
    
  @Test(priority=3, alwaysRun = true)
  public void verifyHomepageTitle() {
       
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      ChromeOptions options = new ChromeOptions();
      options.addArguments("test-type");
      options.addArguments("start-maximized");
      options.addArguments("--js-flags=--expose-gc");
      options.addArguments("--enable-precise-memory-info");
      options.addArguments("--disable-popup-blocking");
      options.addArguments("--disable-default-apps");
      options.addArguments("test-type=browser");    
      options.addArguments("disable-infobars");

      driver = new ChromeDriver();
      
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println(actualTitle); 
      driver.quit();
  }
}