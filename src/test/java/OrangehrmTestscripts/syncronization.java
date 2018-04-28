package OrangehrmTestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class syncronization {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://product.quality.pmapconnect.com/?ssoredirect=no");
		WebDriverWait wt=new WebDriverWait(driver, 20);
		//WebElement login=driver.findElement(By.id("txtUserName"));
	    wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("txtUserName")));
		driver.findElement(By.id("txtUserName")).sendKeys("kumard");
		driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		driver.findElement(By.id("btnLogin")).click();
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='oi oi-logout-o oi-lg oi-fw nav-icon']")));
		driver.findElement(By.xpath("//span[@class='oi oi-logout-o oi-lg oi-fw nav-icon']")).click();
		
	}

}
