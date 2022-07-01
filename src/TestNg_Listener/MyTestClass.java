package TestNg_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg_Listener.Listener.class)
public class MyTestClass {
  @Test (dependsOnMethods = {"method2"})
  public void method1() 
  {
	  Assert.fail();
	 // Reporter.log("Hello",true  );
  }
  @Test
  public void method2() 
  {
	 // Assert.fail();
	  Reporter.log("Hello",true  );
  }

  
}
