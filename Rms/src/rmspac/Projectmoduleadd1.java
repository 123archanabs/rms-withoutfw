package rmspac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Projectmoduleadd1 extends Baseclass
{
@Test(dataProvider="addproject1")
public void addproject1(String event, String ProjectName, String projecttype, String SdateBox, String  clustername, 
		String Clientname,String des,  String dept1, String desgin1, String Budget, String hr) throws InterruptedException

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

	loginpom.projectaddbackbutton.click();
	
	loginpom.projectupdatebutton.click(); // class='btn addButton master-save-btn'
		
	/*Select dept=new Select(loginpom.projectadddept);
	dept.selectByVisibleText(dept1);
	  Thread.sleep(2000);

Select desgin=new Select(loginpom.projectadddegesnation);

	desgin.selectByVisibleText(desgin1);
	loginpom.projectaddsbudget.sendKeys(Budget);
	loginpom.projectaddshours.sendKeys(hr);
	loginpom.projectaddsavebutton.click();*/
	
	
boolean title=	loginpom.projectadddept.isDisplayed();
Assert.assertTrue(title);
	







}
	
	
	
@DataProvider(name="addproject1")
public Object [][] addproject1(){
  
  return new Object [][]{
		  {"valid","rona01me","2", "28/02/2020", "Archana", "B archana" ,"sds fsf" , "QA" , "QA dev" , "500", "3"    },  // should be deleted before if present 
		
  };
  }
	
	
	

}
