package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOver {
	public WebDriver driver;
	public Screen s;
  @Test
  public void f() throws Exception{
	  driver.get("http://spicejet.com");
	  s.hover("D:\\Workspace10AM\\Images.sikuli\\1389072596832.png");
	  driver.findElement(By.linkText("Special Assistance")).click();	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
	  driver=new ChromeDriver();
	  s=new Screen();
  }
}
