package testNGDemo;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount=19)
	void test()
	{
	System.out.println("testing...");	
	}
	
}
