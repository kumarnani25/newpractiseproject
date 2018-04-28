package PageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageobjects {
	
	
	public static  WebDriver driver;

	@FindBy(id="txtUsername")
	public WebElement Username;
	
	@FindBy(id="txtPassword")
	public WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement Login;
	
	@FindBy(xpath="//a[text()='Welcome Admin']")
	public WebElement welcomeAdmin;
	
	
	
	
	
	public Login_pageobjects(WebDriver ldriver)
	{
		Login_pageobjects.driver=ldriver;
	}
	
	
	public void typeUserName(String Uname)
	{
		Username.sendKeys(Uname);
	}
	
	public void typePassword(String Pwd)
	{
		Password.sendKeys(Pwd);
	}
	
	public void clickLogin()
	{
		Login.click();
	}
	
}
