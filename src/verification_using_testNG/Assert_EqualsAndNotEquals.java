package verification_using_testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_EqualsAndNotEquals {
	SoftAssert soft =new SoftAssert();
  @Test
  public void test1()
  {
	  String s1="Velocity";
	  String s2="Velocity";
	  String s3="Velocity_Pune";
	  
	  soft.assertEquals(s1, s2,"Text not match TC is failed ");
	  
  }
  
  @Test 
  public void test2()
  {
	  boolean a=true;
	  
	  soft.assertTrue(a, "a is not true tc failed");
	  
  }
}
