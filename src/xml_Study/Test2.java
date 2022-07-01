package xml_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test (groups="regression")
	  public void myMethod5() 
	  {
		Assert.fail();
		 Reporter.log("myMethod5 regression is running", true);
	  }
	  @Test (groups="sanity")
	  public void myMethod6() 
	  {
			 Reporter.log("myMethod6 sanity is running", true);
	  }
	  @Test
	  public void myMethod7()
	  {
			 Reporter.log("myMethod7 is running", true);
	  }
	  @Test
	  public void myMethod8() 
	  {
			 Reporter.log("myMethod8 is running", true);
	  }
}
