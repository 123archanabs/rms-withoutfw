package rmspac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Clusterdetailsadd extends Baseclass

{
	@Test(dataProvider="addcluster")
	public void Clusterdetails(String event,String cname,String des) throws InterruptedException
	
	{
		
		loginpom.clustersection.click();
		loginpom.Add.click();
		loginpom.ClusterName.sendKeys(cname);
		loginpom.clusterheadname.click();
		//select droplist option selection
		
         Thread.sleep(3000);
	WebElement e=	 driver.findElement(By.xpath("//*[@class='dropdown-container']"));

		
		List<WebElement> aftersort = driver.findElements(By.xpath("//div[@class='dropdown-content']"));
		for( WebElement WebElement :aftersort)
		{
			String headname = WebElement.getText();
			//System.out.println(headname);
			
			if(headname.startsWith("Select All")) {
				WebElement.click();
			
			
			}
		}
		
		e.click();
		
        Thread.sleep(2000);

		loginpom.clientDescription.sendKeys(des);
        Thread.sleep(2000);

		loginpom.ClusterSave.click();
		
		
		if (event.equals("valid"))
		{
		System.out.println("cluster added susccesfully");	
		}
		
		else if (event.equals("cluster exists"))
		{
	String invalidemail = loginpom.addclienterrorvalidation.getText();
	Assert.assertEquals(invalidemail,"Cluster name already exists");
		}
	else if (event.equals("invalid"))
	{
String invalidemail = loginpom.addclienterrorvalidation.getText();
Assert.assertEquals(invalidemail,"please fill all mandatory fields"); 	
	}		
		driver.quit();
		
	}
	
	  @DataProvider(name="addcluster")
		public Object [][] addcluster(){
		  
		  return new Object [][]{
				  {"valid","clustername1", "djfir eere"},  // should be deleted before if present 
				  {"cluster exists","clustername1", "djfir eere"},
				  {"invalid","", "djfir eere"},
				  {"invalid"," ", " "},

		
	};
		
		
		
	}
	
	
	
	

}
