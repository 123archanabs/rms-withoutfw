package rmspac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class masterdata extends Baseclass {
	
	 @Test

	public class ReadWriteExcel
	{
	    WebDriver driver;
	    WebDriverWait wait;
	    HSSFWorkbook workbook;
	    HSSFSheet sheet;
	    HSSFCell cell;
	
	
	
	
	 @Test
	 public void ReadData(String Department) throws IOException
	 {
	     // Import excel sheet.
	     File src=new File("./Rms/Rms/resources/Masterdata.xlsx");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(0);
	      
	     {
	         // Import data for Email.

	    		
	    		{
	    			loginpom.masterdataaddsection.click();
	    			loginpom.masterdataaddbutton.click();
	    			Select selecttype=new Select(loginpom.masterdataaddselecttype);
	    			selecttype.selectByVisibleText("Department");
	    			loginpom.masterdataadddept.sendKeys(Department);
	    		}
	          
	        
	                 
	        }
	
	
	 }
	
	
	
	
	}
}
