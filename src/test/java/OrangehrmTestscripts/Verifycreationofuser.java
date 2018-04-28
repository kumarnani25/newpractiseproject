package OrangehrmTestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseFactory.ExcelFactory;
import BaseFactory.baseClass;
import PageObjectmodel.Verifycreationofuser_objects;


public class Verifycreationofuser extends baseClass{
 
	
	
	
	@Test(priority=1,dataProvider="data")
  public  void Verifycreateduser(String name) throws InterruptedException 
 {
		logger=er.startTest("Verify creation of User");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Verifycreationofuser_objects user=PageFactory.initElements(driver,Verifycreationofuser_objects.class);
		user.clickonAdmin();
		user.clickonuserManagement();
		user.clickonuser();
		user.clickonAdd();
		user.selectEmployee(name);
		user.enterUsername("smith");
		user.enterpassword("test");
		user.enterconfirmpassword("test");
		user.clickonsave();
		Thread.sleep(2000);
	    user.verifycreatedUserName("smith");
	    er.endTest(logger);
		
  }
	/*@Test(priority=2,dependonmethod='Verifycreateduser')
	public  static void Updateuser(String uName,String UnameUD) throws InterruptedException
	{
		logger=er.startTest("Verify updations of User");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Verifycreationofuser_objects user=PageFactory.initElements(driver,Verifycreationofuser_objects.class);
		user.searchusername(uName);
		user.clickonsearchbutton();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td/a[text()='"+uName+"']")).click();
		user.clickonEdit();
		user.username.clear();
		user.enterUsername(UnameUD);
		user.Esave();
		Thread.sleep(2000);
		user.verifyupatedUserName(UnameUD);
		 er.endTest(logger);
	}
	
	
	@Test(priority=3)
	public static void deleteuser(String UnameUD ) throws InterruptedException
	{
		logger=er.startTest("Verify deletion of User");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Verifycreationofuser_objects user=PageFactory.initElements(driver,Verifycreationofuser_objects.class);
	    Thread.sleep(2000);
		user.searchusername(UnameUD);
		user.clickonsearchbutton();
		user.selectcheckbox();
		user.clickondeletebutton();
		user.clickonOk();
		 er.endTest(logger);
	}*/
	
	 @DataProvider(name = "data")
	 public Object[][] getDataApp() throws Exception {

			System.out.println("=====Test Data is getting ready============");

			
			ExcelFactory config=new ExcelFactory();
			
			int rows=config.getRows("Sheet2");
			
			
			Object[][] logins = new Object[rows][2];

			
			for(int i=0;i<=rows;i++)
			{
				
				logins[i][0]=config.readStringData("Sheet2", rows, 0);
				//logins[i][1]=config.readStringData("Login", i, 1);
			}
			

			System.out.println("=====Test Data is ready============");

			return logins;
		}
	
	}