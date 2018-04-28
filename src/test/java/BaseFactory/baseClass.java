package BaseFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObjectmodel.Login_pageobjects;

public class baseClass extends invokeBrowser

{
	public static ExtentReports er;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void reports()
	{
	er=new ExtentReports("./Reports/oragnehrmproject"+System.currentTimeMillis()+".html");
		
	}
	
	
	@BeforeClass
    public void invokeurl()
	{
		invokeBrowser.browserInvoke("Chrome");
		driver.get("http://opensource.demo.orangehrmlive.com/");

		Login_pageobjects pg=PageFactory.initElements(driver, Login_pageobjects.class);
		pg.typeUserName("Admin");
		pg.typePassword("admin");
		pg.clickLogin();
		boolean value=pg.welcomeAdmin.isDisplayed();
		if(value==true)
		{
			System.out.println("Successfully redirected to Home page");
		}
		else
		{
			System.out.println("Home is not displayed");
		}
	}
	
	@AfterSuite
	public void saveReport()
	{
	er.flush();	
	}
	
}
