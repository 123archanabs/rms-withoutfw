package rmspac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Lauch extends Baseclass

{

@	Test
	public void lauch()
	{
		loginpom l = new loginpom(driver);
		
	String title=	l.TitleP();
		Assert.assertEquals(title, "RMS");
	}
	
	
	
}
	
	/*@Test
	public void lauch3() throws Exception 
	{
		
		
		System.out.println("testing started");
		 String actualTitle= driver.getTitle();
		 String expecTitle= "RSM";
		 System.out.println(actualTitle);
		 
			Assert.assertEquals(actualTitle, expecTitle);
			Thread.sleep(5000);
			
			System.out.println("testig completed");
	
	driver.quit();
	//logoverify
//	@Test(priority=1)
//	public void logo() throws InterruptedException
//	{
//		boolean flag = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/img")).isDisplayed();//logo
//		Assert.assertTrue(flag);
//		boolean flag1 = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/img[2]")).isDisplayed();//rightside image
//		Assert.assertTrue(flag1);
//
//		Thread.sleep(5000);
//	}
	
	

	//throw new Exception("Null object");
}


}*/
