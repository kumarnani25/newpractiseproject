package OrangehrmTestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert 
{
	
	@Test
	public void a()
	{
		String msg="hello";
		Assert.assertEquals(msg, "hello");
		System.out.println("Msg verified");
	}

	
	@Test
	public void ab()
	{
		String msg="hello";
		Assert.assertEquals(msg, "hello");
		System.out.println("Msg verified");
	}
}
