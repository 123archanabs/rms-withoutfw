package rmspac;

import java.nio.channels.Selector;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Projectmoduladd extends Baseclass {
	@Test(dataProvider="addproject")
	public void projectaddmodule(String event, String ProjectName, String projecttype, String SdateBox, String  clustername, 
			String Clientname,String des,  String dept1, String desgin1, String Budget, String hr ) throws InterruptedException
	{
	
	loginpom.projectsection.click();
	loginpom.projectadd.click();
	loginpom.projectname.sendKeys(ProjectName);
	Select ptype= new Select(loginpom.projecttype);
	ptype.selectByValue(projecttype);
	
	Actions a1=new Actions (driver);
	  WebElement dateBox = 	loginpom.projectstartdate;	
	  Thread.sleep(2000);

	a1.moveToElement(dateBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
 	Thread.sleep(3000);
 	//JavascriptExecutor js = (JavascriptExecutor) driver;
 	//js.executeScript("arguments[0].value = arguments[1]",
 		//	dateBox, "28/02/2020");
     
    // WebElement a11 = 	loginpom.projectstartdate;
    dateBox.sendKeys(SdateBox);
 	 loginpom.projectname.click();
 	 Thread .sleep(3000);
	
	Select projectclustername= new Select(loginpom.projectclustername);
	projectclustername.selectByVisibleText(clustername);
	
	Select projectclientname= new Select(loginpom.projectclientname);
	projectclientname.selectByVisibleText(Clientname);
	
	loginpom.projectdes.sendKeys(des);
	  Thread.sleep(2000);
	loginpom.projectnextbutton.click();
	  Thread.sleep(2000);

	Select dept=new Select(loginpom.projectadddept);
			dept.selectByVisibleText(dept1);
			  Thread.sleep(2000);
		
	Select desgin=new Select(loginpom.projectadddegesnation);

			desgin.selectByVisibleText(desgin1);
			
			
			WebElement e=	 driver.findElement(By.xpath("//*[@class='dropdown-container']"));
			List<WebElement> skillname = driver.findElements(By.xpath("//div[@class='dropdown-content']"));
			for( WebElement WebElement :skillname)
			{
				String skill = WebElement.getText();
				//System.out.println(headname);
				
				if(skill.equals("Html")) {
					WebElement.click();				
				}
			}
			  Thread.sleep(3000);

	loginpom.projectaddsbudget.sendKeys(Budget);
	loginpom.projectaddshours.sendKeys(hr);
	loginpom.projectaddsavebutton.click();
	
	if (event.equals("valid"))
	{
	System.out.println("project added susccesfully");	
	}
	
	else if (event.equals("invalid"))
	{
String invalidemail = loginpom.projectadderror.getText();
Assert.assertEquals(invalidemail,"please fill all mandatory fields");  ///class="alert alert-warning alert-dismissible"
	}
	else if (event.equals("same project "))
	{
String invalidemail = loginpom.projectadderror.getText();
Assert.assertEquals(invalidemail,"Project name already exists"); //class="alert alert-warning alert-dismissible" AN id="error-part"
	}

	driver.quit();
	
	}
	
	
	
	 @DataProvider(name="addproject")
		public Object [][] addproject(){
		  
		  return new Object [][]{
				  {"valid","rona1me","2", "28/02/2020", "Archana", "B archana" ,"sds fsf" , "QA" , "QA dev" , "500", "3"    },  // should be deleted before if present 
				 
				  {"same project","rona1me","2", "28/02/2020", "Archana", "B archana" ,"sds fsf" , "QA" , "QA dev" , "500", "3"    },  // should be deleted before if present 

				  {"invalid","","2", "28/02/2020", "Archana", "B archana" ,"sds fsf" , "QA" , "QA dev" , "500", "3"    },  // should be deleted before if present 

	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }
	
}



