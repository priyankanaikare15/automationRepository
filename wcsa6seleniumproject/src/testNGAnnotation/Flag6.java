package testNGAnnotation;

import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional TC")
      public void functional_TesCase1()
     {
	  System.out.println("Functional TC1");
     }
 @Test(groups = "Integration TC")
	  public void integration_TesCase1() 
      {
	 System.out.println("Integration TC1");
	  }
@Test(groups = "Smoke TC")
	  public void system_TesCase1()
      {
	   System.out.println("Smoke TC1");
	  }
//---------------------------------------------------//

@Test(groups = "Functional TC")
public void functional_TesCase2()
{
System.out.println("Functional TC2");
}
@Test(groups = "Integration TC")
public void integration_TesCase2() 
{
System.out.println("Integration TC2");
}
@Test(groups = "Smoke TC")
public void system_TesCase2()
{
 System.out.println("Smoke TC2");
}
//-------------------------------------------------------------//

@Test(groups = "Functional TC")
public void functional_TesCase3()
{
System.out.println("Functional TC3");
}
@Test(groups = "Integration TC")
public void integration_TesCase3() 
{
System.out.println("Integration TC3");
}
@Test(groups = "Smoke TC")
public void system_TesCase3()
{
 System.out.println("Smoke TC3");
}

//----------------------------------------------------------//
@Test(groups = "Functional TC")
public void functional_TesCase4()
{
System.out.println("Functional TC4");
}
@Test(groups = "Integration TC")
public void integration_TesCase4() 
{
System.out.println("Integration TC4");
}
@Test(groups = "Smoke TC")
public void system_TesCase4()
{
 System.out.println("Smoke TC4");
}

//----------------------------------------------------------------//

@Test(groups = "Functional TC")
public void functional_TesCase5()
{
System.out.println("Functional TC5");
}
@Test(groups = "Integration TC")
public void integration_TesCase5() 
{
System.out.println("Integration TC5");
}
@Test(groups = "Smoke TC")
public void system_TesCase5()
{
 System.out.println("Smoke TC5");
}
//--------------------------------------------------------------------//
@Test(groups = "Functional TC")
public void functional_TesCase6()
{
System.out.println("Functional TC6");
}
@Test(groups = "Integration TC")
public void integration_TesCase6() 
{
System.out.println("Integration TC6");
}
@Test(groups = "Smoke TC")
public void system_TesCase6()
{
 System.out.println("Smoke TC6");
}
}
