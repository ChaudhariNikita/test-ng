package testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority=1,enabled=false)
  public void reg() {
	  System.out.println("reg test case");
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("login test case");
  }
  @Test(priority=3)
  public void logout() {
	  throw new SkipException("test case is not avilable");
//	  System.out.println("logout test case");
  }
}
