package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
    Reporter.log("Method1",true);
  }
  @Test
  public void method12()
  {
	  Reporter.log("method2", true);
	 // System.out.println("TestNG");
  }
}
