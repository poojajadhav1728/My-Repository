package xml_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test (groups="regression")
	  public void myMethod1() 
	  {
		Assert.fail();
		 Reporter.log("myMethod1 regression is running", true);
	  }
	  @Test (groups="regression")
	  public void myMethod2() 
	  {
			 Reporter.log("myMethod2 regression is running", true);
	  }
	  @Test
	  public void myMethod3()
	  {
			 Reporter.log("myMethod3 is running", true);
	  }
	  @Test (groups="sanity")
	  public void myMethod4() 
	  {
			 Reporter.log("myMethod4 sanity is running", true);
	  }
}
