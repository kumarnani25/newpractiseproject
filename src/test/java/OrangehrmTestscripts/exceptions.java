package OrangehrmTestscripts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exceptions 

{
/* checkout in branch*/

	@Test
	public void url() 
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click(); 
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Waited time got exceeded");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
