package rmspac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Baseclass {
	
	public  WebDriver driver;
	
@BeforeMethod
	public void open() throws InterruptedException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\selenium\\Rms\\data.properties");
	Properties p=new Properties();
	p.load(file);
	
System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver_win32 (5)\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
 // Launching web
	driver.get(p.getProperty("url"));
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  
	PageFactory.initElements(driver, loginpom.class);//

  loginpom.email.sendKeys(p.getProperty("Username"));
  loginpom.password.sendKeys(p.getProperty("Password"));
  loginpom.submit.click();
	Thread.sleep(5000);
	//PageFactory.initElements(driver, this);



}
/*
@AfterMethod
public void afterMETHOD(ITestResult result) throws Exception {


	if(result.getStatus()==ITestResult.FAILURE) {
	File sfilename1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sfilename1, new File(result.getName()+".png"));
	System.out.println("test fail");



}} */

}
		
		
		
		

		
//		
//	   
//	  // 
//	   
//		



/*
 * static { System.setProperty(
 * "webdriver.chrome.driver","C:\\Users\\Saurabh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe"
 * ); }
 * 
 * public static WebDriver driver;
 * 
 * @BeforeClass public void openBrowser() { driver=new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 * //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) }
 * 
 * @AfterClass public void closeBrowser() { driver.close(); }
 * 
 * @BeforeMethod public void login() throws IOException, InterruptedException {
 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 * driver.get("http://rnd-qa.s3-website.ap-south-1.amazonaws.com/login");;
 * Thread.sleep(3000);
 * 
 * System.out.println("123456789");
 * 
 * }
 */
		
		
		
		
		