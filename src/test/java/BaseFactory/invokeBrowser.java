package BaseFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class invokeBrowser 

{

	public static WebDriver driver;
	
	public  static void browserInvoke(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();		
			}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
		      driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("No browser to be invoked");
		}
	}
	
	
	
}
