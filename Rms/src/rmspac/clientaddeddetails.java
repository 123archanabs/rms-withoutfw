package rmspac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clientaddeddetails extends Baseclass {
	
	@Test
	public void clientdetails() {
		
		loginpom.client.click();
		
		loginpom.Firstrowofclienttable.click();
		WebElement backbutton = loginpom.clientdetailbackbutton;
		Assert.assertTrue(backbutton.isDisplayed());
		
	}

}
