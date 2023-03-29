package rmspac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CusterSort extends Baseclass{
	
@Test
public void Clustersort() throws InterruptedException{

   loginpom.clustersection.click();
   
  //loginpom.Clientsearch.sendKeys("aaa");
  
	loginpom.clustersort.click();
	Thread.sleep(2000);
	
	
	System.out.println("===beforclickingsort==");

	List<WebElement> berforsort = driver.findElements(By.xpath("//table[@id='cluster']/tbody/tr/td[1]"));
	for( WebElement WebElement :berforsort)
	{
		String Bnamesort = WebElement.getText();
		System.out.println(Bnamesort);
	}
		Thread.sleep(5000);

		loginpom.clustersort.click();
		Thread.sleep(2000);
		System.out.println("===afterclickingsort==");

		
		List<WebElement> aftersort = driver.findElements(By.xpath("//table[@id='cluster']/tbody/tr/td[1]"));
		for( WebElement WebElement :aftersort)
		{
			String Anameasort = WebElement.getText();
			System.out.println(Anameasort);
			//Assert.assertNotEquals( Bnamesort, Anameasort)	;
		}
		
		
		driver.quit();
	//Assert.assertNotEquals( berforsort, aftersort)	;
		
}	
	

}
