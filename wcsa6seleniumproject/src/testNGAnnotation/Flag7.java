package testNGAnnotation;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(description = "Perform Login")
  public void login_methog()
  {
    System.out.println("Login");
  }
  
  @Test(description = "Create User",dependsOnMethods = "login_methog")
  public void create_User_methog() 
  {
	  Assert.fail();
      System.out.println("Create User");
  }
  @Test(description = "Create User",dependsOnMethods = "create_User_methog",alwaysRun= true)
  public void logout() 
  {
   System.out.println("Logout");
  }
}
