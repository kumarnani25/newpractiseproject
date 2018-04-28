package OrangehrmTestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	@Test
	public void abc()
	{
		String msg="hello";
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(msg, "hello341");
		System.out.println("Msg verified abc");
		Assert.assertAll();
	}
	@Test
	public void abcd()
	{
		String msg="hello";
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(msg, "hello");
		System.out.println("Msg verified abcd");
		Assert.assertAll();
	}
}
