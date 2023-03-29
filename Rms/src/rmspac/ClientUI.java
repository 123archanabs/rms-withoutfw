package rmspac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ClientUI extends Baseclass

{
	@Test
	public void clientui() throws InterruptedException{
		
		
		loginpom.client.click();
	
	   
	   //header is present
	   WebElement Header = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/header"));
	   if (Header.isDisplayed())   
	   {
		   System.out.println("haeder is present");
	   }
		   else
		   {
			   System.out.print("haeder is not present");   
	       }
	  //add button 
	 Thread.sleep(3000);
	 if( loginpom.Add.isDisplayed())
	 {
		  System.out.println("add button is present");
	   }
		   else
		   {
			   System.out.print("add button is not present");  
	       }
	 
		
	   //
		 if( loginpom.Clientsearch.isDisplayed())
		 {
			  System.out.println("search Text field is present");
		   }
			   else
			   {
				   System.out.println("search Text field  is not present");  
		       }
	 //cloumn is present 
		 List<WebElement> Listlink = driver.findElements(By.xpath("//th[@class='TableHeader sort-header']")); // list
			//System.out.println(Listlink.size());
			
			for( WebElement WebElement :Listlink) {
				
			String name = WebElement.getText();
			System.out.println(name +" column are present");		
           }
			
			loginpom.Clientdeleteeditmenu.click();
			
			 if( loginpom.clientedit.isDisplayed())
			 {
				  System.out.println("Client edit option  is present");
			   }
				   else
				   {
					   System.out.println("Client  edit option is not present");  
			       }
			 
			 if( loginpom.clientdelete.isDisplayed())
			 {
				  System.out.println("Client delete option  is present");
			   }
				   else
				   {
					   System.out.println("client delete option is not present");  
				   }
			 loginpom.clientedit.click();
			 
			 
			
			 
			 if( loginpom.clientName.isDisplayed() && loginpom.ContactpersonName.isDisplayed() && loginpom.Contactpersonemail.isDisplayed() && 
					 
					 loginpom.Contactpersonphoneno.isDisplayed() && loginpom.clientDescription.isDisplayed()  && loginpom.clienteditupdate.isDisplayed() )
			 {
				  System.out.println("all elements of add Client textbox  is present");
			   }
				   else
				   {
					   System.out.println("Some client  element  is not present");  
				   }
				Thread.sleep(3000);

			 loginpom.addclientclose.click();
				Thread.sleep(3000);

			 loginpom.Clientdeleteeditmenu.click();
				Thread.sleep(3000);

			 loginpom.clientdelete.click();
			 
			
			 driver.quit();
			 
		
		}}
