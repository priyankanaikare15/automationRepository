package testNGAnnotation;

import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 0)
  public void f() {
	  System.out.println("f");
  }
  @Test(priority = 0)
  public void z() {
	  System.out.println("z");
  }
  @Test(priority = 10)
  public void q() {
	  System.out.println("q");
  }
  @Test(priority = 5)
  public void g() {
	  System.out.println("g");
  }
  @Test
  public void r() {
	  System.out.println("r");
  }
  @Test(priority = 3)
  public void l() {
	  System.out.println("l");
  }
  @Test
  public void w() {
	  System.out.println("w");
  }
  @Test(priority = 7)
  public void h() {
	  System.out.println("h");
  }
  @Test(priority = 1)
  public void c() {
	  System.out.println("c");
  }
}
