package rmspac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clientsort extends Baseclass{



@Test
public void Clientsort() throws InterruptedException{

   loginpom.client.click();
   
  loginpom.Clientsearch.sendKeys("aaa");
  
	loginpom.Clientsort.click();
	Thread.sleep(5000);

	List<WebElement> actualname = driver.findElements(By.xpath("//table[@id='client']/tbody/tr/td[1]"));
	for( WebElement WebElement :actualname)
	{
		String name = WebElement.getText();
		System.out.println(name);
	}
		Thread.sleep(5000);

		loginpom.Clientsort.click();
		Thread.sleep(5000);
		System.out.println("===afterclickingsort==");

		
		List<WebElement> aftersort = driver.findElements(By.xpath("//table[@id='client']/tbody/tr/td[1]"));
		for( WebElement WebElement :aftersort)
		{
			String nameasort = WebElement.getText();
			System.out.println(nameasort);
		}

driver.quit();

}
}
