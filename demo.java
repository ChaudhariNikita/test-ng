package testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class demo {
	public static WebDriver wd;
	
  @Test
  public void f() {
	  wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("nikita");
  }
  @BeforeTest
  public void beforeTest() {
	  wd= new ChromeDriver();
	  wd.get("https://demo.guru99.com/test/newtours/register.php");
  }

}
