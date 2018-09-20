package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;

import BaseFactory.baseClass;

public class Verifycreationofuser_objects extends baseClass
{

/* updated in branch*/

	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	public WebElement admin;

	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	public WebElement userManagement;
	
	@FindBy(xpath="//a[text()='Users']")
	public WebElement users;
	
	@FindBy(name="btnAdd")
	public WebElement Add;
	
	@FindBy(id="systemUser_employeeName_empName")
	public WebElement Employeename;
	
	
	@FindBy(id="systemUser_userName")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement save;
	
	
	@FindBy(xpath="//input[@id='systemUser_password']")
	public WebElement password;
	
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='btnSave'][@value='Edit']")
	public WebElement edit;
	
	@FindBy(xpath="//input[@id='btnSave'][@value='Save']")
	public WebElement editsave;
	
	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	public WebElement searchusername;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public WebElement clicksearch;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[1]")
	public WebElement checkbox;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	public WebElement delete;
	
	@FindBy(xpath="//input[@id='dialogDeleteBtn'][@value='Ok']")
	public WebElement Ok;
	
	
	public void clickonOk()
	{
		Ok.click();
		logger.log(LogStatus.INFO, "clicked on Ok button");
	}
	
	public void clickondeletebutton()
	{
		delete.click();
		logger.log(LogStatus.INFO, "clicked on Deleted button");
	}
	
	public void selectcheckbox()
	{
		checkbox.click();
		logger.log(LogStatus.INFO, "clicked on checkbox button");
	}
	
	public void searchusername(String Name)
	{
		searchusername.sendKeys(Name);
		logger.log(LogStatus.INFO, "Entered required Name");
	}
	public void clickonsearchbutton()
	{
		clicksearch.click();
		logger.log(LogStatus.INFO, "clicked on search icon");
	}
	
	public void clickonEdit()
	{
		edit.click();
		logger.log(LogStatus.INFO, "clicked on Edit button");
	}
	
	public void Esave()
	{
		editsave.click();
		logger.log(LogStatus.INFO, "clicked on on save button");
	}
	
	
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
		logger.log(LogStatus.INFO, "Entered password field");
	}
	
	public void enterconfirmpassword(String pwd)
	{
		confirmPassword.sendKeys(pwd);
		logger.log(LogStatus.INFO, "Entered confirmation password");
	}
	
	
	public void clickonAdmin()
	{
		admin.click();
		logger.log(LogStatus.INFO, "clicked on Admin Tab");
	}
	
	public void clickonuserManagement()
	{
		userManagement.click();
		logger.log(LogStatus.INFO, "clicked Usermanagement Tab");
	}
	
	public void clickonuser()
	{
		users.click();
		logger.log(LogStatus.INFO, "clicked on User Tab");
	}
	
	
	public void clickonAdd()
	{
		Add.click();
		logger.log(LogStatus.INFO, "clicked on Add button");
		
	}
	
	public void selectEmployee(String Ename)
	{
		Employeename.sendKeys(Ename);
		
		logger.log(LogStatus.INFO, "Entered Employee Name");
	}
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
		logger.log(LogStatus.INFO, "Entered User Name");
	}
	
	public void clickonsave()
	{
		save.click();
		logger.log(LogStatus.INFO, "clicked on save");
	}
	
	
	
	
	
	public  void verifycreatedUserName(String username)
	{
		WebElement uname=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td/a[text()='"+username+"']"));
		
	   boolean uname1=uname.isDisplayed();
	   if(uname1==true)
	   {
		   logger.log(LogStatus.PASS,""+username+" has been creataed");
	   }
	   else
	   {
		   logger.log(LogStatus.FAIL,"Failed to create"+username+"");
	   }
	}
	
	public  void verifyupatedUserName(String username)
	{
		WebElement uname=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td/a[text()='"+username+"']"));
		
	   boolean uname1=uname.isDisplayed();
	   if(uname1==true)
	   {
		   logger.log(LogStatus.PASS,""+username+" has been Upated");
	   }
	   else
	   {
		   logger.log(LogStatus.FAIL,"Failed to Update"+username+"");
	   }
	}
	

	
}
