package GroupingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest3 {
  @Test (groups = "sanity")
  public void myMethod9() 
  {
		 Reporter.log("myMethod9 is running", true);
  }
  @Test (groups = "sanity")
  public void myMethod10() 
  {
		 Reporter.log("myMethod10 is running", true);
  }
  @Test	(groups = "retesting")
  public void myMethod11()
  {
		 Reporter.log("myMethod11 is running", true);
  }
  @Test (groups = "regression")
  public void myMethod12() 
  {
		 Reporter.log("myMethod12 is running", true);
  }
}
