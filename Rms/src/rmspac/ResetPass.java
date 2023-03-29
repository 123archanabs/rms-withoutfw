package rmspac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ResetPass 
{
	public WebDriver driver;

	@Test(dataProvider="testdata")
	public void Reset(String event ,String email) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		
       // Launching web
		driver.get("http://rnd-qa.s3-website.ap-south-1.amazonaws.com/login");
	    driver.manage().deleteAllCookies();
		
		 PageFactory.initElements(driver, loginpom.class);
		    loginpom.Resetpass.click();
		    loginpom.email.sendKeys(email);
			Thread.sleep(5000);
		    loginpom.submitemail.click();
		    Thread.sleep(3000);
		    
		    if (event.equals("Valid")&& loginpom.password.isDisplayed()) 
		    {
		    	System.out.println(" password reset link sent to registered email id");
		    } 
		    else	
		    {
		    	System.out.println("invalid email id entered");
		    }
	
		   
driver.quit();
}
	

	@DataProvider (name="testdata")
	public  Object [] [] testdata()   {
		
		 
		return new   Object[][] {
		        
			{"Valid","himay@gloify.com"},
		         
		          
			{"Invalid","archana"},
		         
		          
			{"Invalid","122234"},
		          
		          
			{"invalid",""},
		         
		          
		};
	

	
	
	
	}}
	





