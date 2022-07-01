package keywordsStudy;

import org.testng.annotations.Test;

public class priorityUse {
	@Test (priority=2)
	  public void myMethod1() 
	  {
		  System.out.println("myMethod1 is running");
	  }
	  @Test
	  public void myMethod2() 
	  {
		  System.out.println("myMethod2 is running");
	  }
	  @Test(priority=-1) 
	  public void myMethod3()
	  {
		  System.out.println("myMethod3 is running");
	  }
	  @Test(priority=-1)
	  public void myMethod4() 
	  {
		  System.out.println("myMethod4 is running");
	  }
}
