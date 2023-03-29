package rmspac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clusterUI extends Baseclass {

@Test
	public void clusterUI() throws InterruptedException
	{

		loginpom.clustersection.click();
		String Header= loginpom.clusterheader.getText();
		Assert.assertEquals(Header,"Clusters");
	

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
		
		
	 if( loginpom.Clientsearch.isDisplayed())
	 {
		  System.out.println("search Text field is present");
	   }
		   else
		   {
			   System.out.println("search Text field  is not present");  
	       }	 
	
	 
	 loginpom.clustereditdelete.click();
		
	 if( loginpom.clustereditdelete.isDisplayed())
	 {
		  System.out.println("Client edit option  is present");
	   }
	else
	 {
			   System.out.println("Client  edit option is not present");  
	  }
	 
	 
	 if( loginpom.clusterdeloption.isDisplayed())
	 {
		  System.out.println("Client delete option  is present");
	   }
		   else
	 {
			   System.out.println("client delete option is not present");  
	 }
	loginpom.Add.click(); 
	  
if	(loginpom.Add.isDisplayed()&& loginpom.ClusterName.isDisplayed()&& loginpom.clusterDescription.isDisplayed()) 
{
	  System.out.println("Add Cluster  option  is present");
}
else	
{
	  System.out.println("Client delete option  is present");
}

	 loginpom.addclientclose.click();
	 
	 
	 if	(loginpom.ClusterReportGrpname.isDisplayed()&& loginpom.ClusterReportperiodname.isDisplayed()&& loginpom.clustergraph.isDisplayed()) 
	 {
	 	  System.out.println(" Cluster Report  links  is present");
	 }
	 else	
	 {
	 	  System.out.println("Cluster Report links  is not present");
	 }	 
	 
	 
	 
	 
	 
	driver.quit(); 
	 
	 
	 
	
	
}	}


