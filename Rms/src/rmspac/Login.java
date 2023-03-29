package rmspac;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;




public class Login extends Baseclass
{
	
	
	@Test  (dataProvider="testdata")
	public void loginDatadriven(String senrio , String email , String pass ) throws Exception {
		
    if (senrio.equals("both correct"))
    		{
    	WebElement loggedIn = loginpom.client;
   	Assert.assertTrue(loggedIn.isDisplayed());
   	System.out.println("login susscessful");
    		}
    
    
    else if(senrio.equals("both incorrect")&& senrio.equals("withou data")  && loginpom.submit.isDisplayed())
        {
    	System.out.println("login not susscessful");
	    
	    }
   	
	  driver.quit();

	}
	
	
	@DataProvider (name="testdata")
	public  Object [] [] testdata()   {
		
		 
		    return new   Object[][] {
		    	
		    	
		    	
		    	{"both correct","himay@gloify.com","123456789"},
		    	{"both incorrect","aaso@gmail.com","244"},
		    	{"both incorrect","aasogmail.com","244"},
		    	{"without data ","",""},
		    	
		    	
		   
		    
		    };
		    
	}
}
		       
		        
		         
		          
		       
		          

	

	
	
	

	