package OrangehrmTestscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert 
{
	/*test branch*/
	@Test
	public void a()
	{
		String msg="hello";
		Assert.assertEquals(msg, "hello");
		System.out.println("Msg verified");
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
