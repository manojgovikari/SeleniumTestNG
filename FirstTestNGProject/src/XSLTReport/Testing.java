package XSLTReport;
import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;		
import org.testng.Assert;		
import org.testng.annotations.Test;		
    		
public class Testing {		
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String driverPath = "C:\\Users\\Manoj\\Desktop\\OFFICE PROJECT WORK\\Java_selenium_Documentation_Setup\\chromedriver_win32\\chromedriver.exe";
	 public static WebDriver driver;
    			

    @Test(priority=1)			
    public void Login() 					
    {		
  	  System.setProperty("webdriver.chrome.driver", driverPath);
  	 driver= new ChromeDriver();		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");					
                        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");							
        driver.findElement(By.name("password")).sendKeys("amUpenu");							
        driver.findElement(By.name("btnLogin")).click();					
        //Verifying the manager home page		
        Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage" );					
    }		
    		
    @Test(priority=2)			
    public void verifytitle()					
    {		
        //Verifying the title of the home page		
        Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage" );					
        }		
    		
    @Test(priority=3)			
    public void Logout()					
    {		
        driver.findElement(By.linkText("Log out")).click();					
        Alert alert=driver.switchTo().alert();			
        alert.accept();		
        //Verifying the title of the logout page		
        Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page" );					
    }		
}