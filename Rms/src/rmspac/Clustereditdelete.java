package rmspac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Clustereditdelete extends Baseclass{
	
	@Test
	public void aedit() throws InterruptedException {
		
		loginpom.clustersection.click(); 
        Thread.sleep(2000);

		loginpom.clustereditdelete.click();
		loginpom.clientedit.click();
        loginpom.ClusterName.clear();
        loginpom.ClusterName.sendKeys("New Project");//del if project present
        loginpom.clienteditupdate.click();
        Thread.sleep(2000);
        loginpom.clustersearch.sendKeys("New Project");
        Thread.sleep(2000);
 String clustername   =    loginpom.clustertablefirstrowfirstcol.getText();
        
        //System.out.println(name);
       	Thread.sleep(2000);

        Assert.assertEquals(clustername, "New Project");
		driver.quit();
	}
	
	
	@Test
	public void bclusterdelete() throws InterruptedException
	
	{

		loginpom.clustersection.click(); 
		Thread.sleep(3000);

		loginpom.clustereditdelete.click();
		Thread.sleep(2000);
		
		 Actions a1=new Actions (driver);
	  		WebElement ele3 = loginpom.clusterdeloption;
			Thread.sleep(2000);

	  		a1.moveToElement(ele3).click().perform();
	  		
			Thread.sleep(2000);

			loginpom.clientdeletpopup.isDisplayed();
			Thread.sleep(2000);

			loginpom.clientdeletpopupyes.click();
	  		
			Thread.sleep(2000);
			
			 loginpom.Clientsearch.sendKeys("New Project");
			Thread.sleep(3000);

	String norecordlogo =	loginpom.emptyclustertable.getText();

	  		Assert.assertEquals(norecordlogo, "No records has been added yet.");
	  		
			
			Thread.sleep(2000);
			driver.quit();

	}
	
	
	
		
	
	
	
	
	
	
	
	

}
