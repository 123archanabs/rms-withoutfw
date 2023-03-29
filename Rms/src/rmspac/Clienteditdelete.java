package rmspac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Clienteditdelete extends Baseclass
{

	
	
@Test
public void ClientEdit() throws InterruptedException{
//open browser	
	 String search= "Aara";
	//Thread.sleep(2000);
   loginpom.client.click();
   
  loginpom.Clientsearch.sendKeys("Aaa"); //added client name aaa
	Thread.sleep(2000);

  loginpom.Clientdeleteeditmenu.click();
  loginpom.clientedit.click();
  
  loginpom.clientName.clear();
	Thread.sleep(2000);

  loginpom.clientName.sendKeys(search);
	Thread.sleep(2000);

  loginpom.clienteditupdate.click();
  
  loginpom.Clientsearch.clear();
	Thread.sleep(2000);

 loginpom.Clientsearch.sendKeys(search);
 
 Thread.sleep(3000);
   
 String name = loginpom.firstrowfirstcolclientname.getText(); ////table[@id="client"]/tbody/tr[1]/td[1]
 
 //System.out.println(name);
	Thread.sleep(2000);

 Assert.assertEquals(name, "Aara");
 
 driver.quit();
  
  
	
}
	@Test
	public void Clientdelete() throws InterruptedException
	
	{
		 String search= "Aara";
		loginpom.client.click();
	
		 loginpom.Clientsearch.sendKeys("Aara");
		Thread.sleep(3000);

		loginpom.Clientdeleteeditmenu.click();
		Thread.sleep(2000);
		
		 Actions a1=new Actions (driver);
	  		WebElement ele3 = loginpom.clientdeleteoption;
			Thread.sleep(2000);

	  		a1.moveToElement(ele3).click().perform();
	  		
			Thread.sleep(2000);

			loginpom.clientdeletpopup.isDisplayed();
			Thread.sleep(2000);

			loginpom.clientdeletpopupyes.click();
	  		
			Thread.sleep(2000);
			
			 loginpom.Clientsearch.sendKeys(search);
			Thread.sleep(3000);

	String norecordlogo =	loginpom.emptyclienttable.getText();

	  		Assert.assertEquals(norecordlogo, "No records has been added yet.");
	  		driver.quit();
			
			
			

		
		
		
//        loginpom.clientdelete.click();
//		Thread.sleep(2000);


	}

	
	

}
