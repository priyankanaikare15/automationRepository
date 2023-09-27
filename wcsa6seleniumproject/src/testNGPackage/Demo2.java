package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
	public void method3()
	{
		Reporter.log("Method3", true);
	}
  @Test
	public void method4()
	{
		Reporter.log("Method4", true);
	}
}
