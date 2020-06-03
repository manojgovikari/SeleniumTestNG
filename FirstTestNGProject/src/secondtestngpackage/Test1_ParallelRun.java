package secondtestngpackage;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;	
public class Test1_ParallelRun {
	String driverPath = "C:\\Users\\Manoj\\Desktop\\OFFICE PROJECT WORK\\Java_selenium_Documentation_Setup\\chromedriver_win32\\chromedriver.exe";
	
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver",driverPath);
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.chrome.driver",driverPath);
    	WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
            
}