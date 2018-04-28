package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseFactory.baseClass;

public class commonFunctions extends baseClass {
	
	
	public static void scrollIntoview(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

}
