package OrangehrmTestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class verifyAssert {
	
	@Test
	public void login()
	{
		
		SoftAssert a=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dapproduct.quality.pmapconnect.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUserName")).sendKeys("kumard");
		driver.findElement(By.id("txtPassword")).sendKeys("Pmap@123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement msg=driver.findElement(By.xpath("//div[@id='messageContent']"));
		String Message=msg.getText();
		a.assertEquals(Message, "The password you have entered is incorrect.Your Account will be deactivated after 2 invalid login attempts");
		System.out.println("Value");
		a.assertAll();
	}

}
