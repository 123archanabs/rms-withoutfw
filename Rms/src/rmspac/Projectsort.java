package rmspac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Projectsort extends Baseclass {
	
	static String sort;
	@Test
	public void sort() throws InterruptedException {
	
	loginpom.projectsection.click();
	//loginpom.projectcolsort.click();
 
	 
		Thread.sleep(2000);
		
		
		System.out.println("===beforclickingsort==");

		List<WebElement>  column = driver.findElements(By.xpath("//table[@id='project']/tbody/tr/td[1]"));
	String[]	Bnamesort= new String [column.size()];

	for (int i=0;i<column.size();i++)
	   {
			 Bnamesort[i] = column.get(i).getText().trim();
			System.out.println(Bnamesort[i]);
		}
			
	
	System.out.println("===Aftorsortjava==");
			for (int i=0;i<column.size();i++)
			{
				Arrays.sort(Bnamesort);
				sort= Bnamesort[i];
				System.out.println(sort);
			}
			
			
			
		//	loginpom.projectcolsort.click();
			Thread.sleep(2000);
			
			
			
			System.out.println("===afterclickingsort==");
			 column = driver.findElements(By.xpath("//table[@id='project']/tbody/tr/td[1]"));
			 String[]	Anamesort= new String [column.size()];

				for (int i=0;i<column.size();i++)
				   {
						 Anamesort[i] = column.get(i).getText().trim();
						System.out.println(Anamesort[i]);
					}
					
			
			Assert.assertEquals( Bnamesort, Anamesort)	;
			System.out.println("SORT DONE");
			driver.quit();
		
	
	
	
	
	}
	
	

}
