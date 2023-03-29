package rmspac;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectEditDelete extends Baseclass {
	
	@Test
	public void aprojectedit() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

		loginpom.projectsection.click(); 
        Thread.sleep(2000);

		loginpom.projecteditdelmenu.click();
		loginpom.projecteditmenu.click();
		
		Actions a1=new Actions (driver);
		  WebElement projectname = 	loginpom.projectname;	
		  Thread.sleep(2000);

		a1.moveToElement(projectname).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
        loginpom.projectname.sendKeys("New Project");//del if project present
        
      
		  Thread.sleep(2000);

        js.executeScript("window.scrollBy(900,500)");
		  Thread.sleep(3000);

  	loginpom.projectupdatebutton.click();

  		
        
        
        
        
       // loginpom.projectupdatebutton.click();
        Thread.sleep(2000);
        loginpom.projectsearch.sendKeys("New Project");
        Thread.sleep(2000);
 String projectname1   =    loginpom.projectfirstcolrow.getText();
        
        //System.out.println(name);
       	Thread.sleep(2000);

        Assert.assertEquals(projectname1, "New Project");
		driver.quit();
	}
	
	
/*	@Test
	public void projectdelete() throws InterruptedException
	
	{

		loginpom.projectsection.click(); 
        Thread.sleep(2000);

		loginpom.projecteditdelmenu.click();
		Thread.sleep(2000);
		
		 Actions a2=new Actions (driver);
	  		WebElement ele3 = loginpom.projectdelmenu;
			Thread.sleep(2000);

	  		a2.moveToElement(ele3).click().perform();
	  		
			Thread.sleep(2000);

			loginpom.clientdeletpopup.isDisplayed();
			Thread.sleep(2000);

			loginpom.clientdeletpopupyes.click();
	  		
			Thread.sleep(2000);
			
			 loginpom.projectsearch.sendKeys("New Project");
			Thread.sleep(3000);

	String norecordlogo =	loginpom.emptyclustertable.getText();

	  		Assert.assertEquals(norecordlogo, "No records has been added yet.");
	  		
			
			Thread.sleep(2000);
			driver.quit();

	}*/

}
