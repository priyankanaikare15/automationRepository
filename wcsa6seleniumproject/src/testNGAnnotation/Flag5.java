package testNGAnnotation;

import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "Performs Login")
  public void login_method() {
	  System.out.println("It is used to perform login!");
  }
  @Test(description = "Perform Create User",dependsOnMethods = "login_method")
  public void create_user_method()
  {
	  System.out.println("user created");
  }
  @Test(description = "Perform LogOut",dependsOnMethods ="create_user_method" )
  public void logout_method()
  {
	  System.out.println("It is used to perform Logout");
  }
}
