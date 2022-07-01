package GroupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest2 {
	 @Test (groups = "sanity")
	  public void myMethod5() 
	  {
		 Reporter.log("myMethod5 is running", true);
	  }
	  @Test (groups = "sanity")
	  public void myMethod6() 
	  {
			 Reporter.log("myMethod6 is running", true);
	  }
	  @Test (groups = "retesting")
	  public void myMethod7()
	  {
			 Reporter.log("myMethod7 is running", true);
	  }
	  @Test (groups = "regression")
	  public void myMethod8() 
	  {
			 Reporter.log("myMethod8 is running", true);
	  }
}
