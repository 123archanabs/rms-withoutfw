package rmspac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Projectsearch extends Baseclass {


@Test
	public void addproject() throws InterruptedException
	
	{
		String projectname="BArchana";// dele if present
		loginpom.projectsection.click();
		loginpom.projectadd.click();
		loginpom.projectname.sendKeys(projectname);
		Select ptype= new Select(loginpom.projecttype);
		ptype.selectByValue("2");
		
		Actions a1=new Actions (driver);
		  WebElement dateBox = 	loginpom.projectstartdate;	
		  Thread.sleep(2000);

		a1.moveToElement(dateBox).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	 	Thread.sleep(3000);
	 	dateBox.sendKeys("23/5/20");
		 loginpom.projectname.click();
		 Thread .sleep(3000);
		
		Select projectclustername= new Select(loginpom.projectclustername);
		projectclustername.selectByVisibleText("Archana");
		
		Select projectclientname= new Select(loginpom.projectclientname);
		projectclientname.selectByVisibleText("B archana");
		
		loginpom.projectdes.sendKeys("Des text box");
		 Thread.sleep(2000);
		loginpom.projectnextbutton.click();	
		
		Select dept=new Select(loginpom.projectadddept);
		dept.selectByVisibleText("QA");
		  Thread.sleep(2000);

	Select desgin=new Select(loginpom.projectadddegesnation);

		desgin.selectByVisibleText("QA dev");
		loginpom.projectaddsbudget.sendKeys("600");
		loginpom.projectaddshours.sendKeys("5");
		loginpom.projectaddsavebutton.click();
		
		
		loginpom.projectsearch.sendKeys(projectname);
		
		  Thread.sleep(2000);

		
		
			
			List<WebElement> psearch = driver.findElements(By.xpath("//table[@id='project']/tbody/tr/td[1]"));
			for( WebElement WebElement :psearch)
			{
				String pname = WebElement.getText();
				System.out.println(pname);
				
				if (pname.contains(projectname))
				{
					System.out.println("search is working");
				}else
					
				{
					System.out.println("search is not working")	;
					
				}
				
				
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	












}
