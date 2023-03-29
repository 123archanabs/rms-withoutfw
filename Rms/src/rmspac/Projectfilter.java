package rmspac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Projectfilter extends Baseclass{
	
	@Test
	public void projectcusterfilter() throws InterruptedException
	{
	loginpom.projectsection.click();
	loginpom.projectfliter.click();
	loginpom.projectclusterfliter.click();
	
	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//*[text()='Archana']/child::input"))).click().perform();
	
	loginpom.projectfilterapply.click();
	
	String name=	loginpom.projectclustercolfirstname.getText();
	
	Assert.assertEquals(name, "Archana");
	
	

}
	
	
	@Test
	public void projectclientfilter() throws InterruptedException
	{
	loginpom.projectsection.click();
	loginpom.projectfliter.click();
	loginpom.projectclientfliter.click();
	
	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//*[text()='B archana']/child::input"))).click().perform();
	
	loginpom.projectfilterapply.click();
	
	String name1=loginpom.projectclientcolfirstname.getText();
	
	Assert.assertEquals(name1, "B archana");
	
	
	
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	


