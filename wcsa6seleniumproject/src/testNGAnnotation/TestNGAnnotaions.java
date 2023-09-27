package testNGAnnotation;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotaions {
  @Test
  public void method_test_Annotation1() {
	  Reporter.log("TestAnnotation1",true);
  }
  @Test
  public void method_test_Annotation2() {
	  Reporter.log("TestAnnotation2",true);
  }
  
  @BeforeMethod
  public void method_beformethod_annotaion()
  {
	  Reporter.log("BeforeMethodAnnotation",true);
  }
  @AfterMethod
  public void method_afterMethod_annotation()
  {
	 Reporter.log("AfterMethodAnnotation",true);
  }
  @BeforeClass
  public void method_beforeclass_annotation()
  {
	  Reporter.log("BeforeClassAnnotation",true);
  }
  @AfterClass
  public void method_afterclass_annotation()
  {
	  Reporter.log("AfterClassAnnotation",true);
  }
  @BeforeTest
  public void method_beforetest_annotation()
  {
	  Reporter.log("BeforeTestAnnotation",true);
  }
  @AfterTest
  public void method_aftertest_annotaion()
  {
	  Reporter.log("AfterTestAnnotation",true);
  }
  @BeforeSuite
  public void method_beforesuite_annotation()
  {
	  Reporter.log("BeforeSuiteAnnotation",true);
  }
  @AfterSuite
  public void method_aftersuite_annotation()
  {
	  Reporter.log("AfterSuiteAnnotation",true);
  }
}
