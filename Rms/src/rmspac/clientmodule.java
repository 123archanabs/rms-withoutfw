package rmspac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;

@Listeners
public class clientmodule extends Baseclass
{
	//public WebDriver driver;
	
	@Test(dataProvider="testdata")
public void addclient(String validation,String clientName,String clientcontactname,String ClientEmail,String clientpersonphno, String  description  ) throws InterruptedException{
	
/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
 // Launching web
	driver.get("http://rnd-qa.s3-website.ap-south-1.amazonaws.com/login");
   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		  
		
        PageFactory.initElements(driver, loginpom.class);
        loginpom.email.sendKeys("himay@gloify.com");
        loginpom.password.sendKeys("123456789");
        loginpom.submit.click();
		Thread.sleep(5000); */

        loginpom.client.click();
        loginpom.Add.click();
     
		Thread.sleep(5000);
		loginpom.clientName.sendKeys(clientName);
		loginpom.ContactpersonName.sendKeys(clientcontactname);
		loginpom.Contactpersonemail.sendKeys(ClientEmail);
		loginpom.Contactpersonphoneno.sendKeys(clientpersonphno);
		loginpom.clientDescription.sendKeys(description);
		Thread.sleep(2000);
		   loginpom.clientaddsubmit.click();
			Thread.sleep(2000);
		
			if (validation.equals("valid")&& loginpom.Add.isDisplayed())
			{
			System.out.println("Client added susccesfully");	
			}
			
			else if (validation.equals("same client"))
    		{
    	String invalidemail = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(invalidemail,"Client already exists"); 
    		}
			
			else if (validation.equals("invalid email"))
    		{
    	String invalidemail = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(invalidemail,"Please enter valid email address"); 
    		}
			
			else if (validation.equals("No Data"))
    		{
    	String Nodata = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(Nodata,"please fill all mandatory fields");
    		}
			
			else if (validation.equals("Without client name"))
    		{
    	String withoutclientname = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(withoutclientname,"please fill all mandatory fields");
    		}	
			
			else if (validation.equals("Without contact name"))
    		{
    	String withoutclientname = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(withoutclientname,"please fill all mandatory fields");
    		}
			
			else if (validation.equals("Without email"))
    		{
    	String withoutclientname = loginpom.addclienterrorvalidation.getText();
    	Assert.assertEquals(withoutclientname,"please fill all mandatory fields");
    		}
			
         driver.quit();
}
	
	@DataProvider (name="testdata")
	public  Object [] [] testdata()   {
		     return new   Object[][]  { 
		    	 {"valid", "newclient", "new name","new@gmail.com","",""}, // delete if same record exist
		    	 {"valid", "newdataclient", "newdataname","new@gmail.com", "9866675443", "uiui oioiu tyt 89o rryty "}, // delete if same record exist
		    	 {"same client", "newclient", "new name","new@gmail.com","",""},
		    	 {"invalid Email", "wew","e3", "4e", "45", "dsd"},
		    	 {"No Data","","","","",""},
		    	 {"Without client name", "", "name3","a@gmail.com","",""},
		    	 {"Without contact name", "client8", " ","a@gmail.com", "", ""},
		    	 {"Without email", "client9","name4","","",""}, 
		     };
	
}



}
