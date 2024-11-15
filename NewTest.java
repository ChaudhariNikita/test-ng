package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver wd;
  @Test
  @Parameters({"un","pw"})
  public void login( String un,String pw) throws Exception {
	  wd.findElement(By.name("username")).sendKeys(un);
	  Thread.sleep(1000);
	  wd.findElement(By.name("password")).sendKeys(pw);
	  Thread.sleep(1000);
	  wd.findElement(By.id("submit")).click();
	  Thread.sleep(1000);
  }
  @BeforeTest
  public void beforeTest() {
	  wd=new ChromeDriver();
	  wd.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterTest
  public void afterTest() {
	  wd.close();
  }

}
