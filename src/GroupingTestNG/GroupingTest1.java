package GroupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest1 {
	 @Test (groups = "sanity")
	  public void myMethod1() 
	  {
		 Reporter.log("myMethod1 is running", true);
	  }
	  @Test (groups = "sanity")
	  public void myMethod2() 
	  {
			 Reporter.log("myMethod2 is running", true);

	  }
	  @Test (groups = "retesting")
	  public void myMethod3()
	  {
			 Reporter.log("myMethod3 is running", true);

	  }
	  @Test (groups ="regression")
	  public void myMethod4() 
	  {
			 Reporter.log("myMethod4 is running", true);

	  }
}
