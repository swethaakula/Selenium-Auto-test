package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mail_Login_Register {
	public WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Started");	
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Ended");
	}

	@Before //Precondition
	public void setUp() throws Exception {
		driver=new ChromeDriver();	
		driver.get("http://mail.in.com");
	}
	@After //Post condition
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();	
	}	
	@Test //TestScenario
	public void verifyRegister() throws Exception{
		driver.findElement(By.cssSelector("input.registernow")).click();
		driver.findElement(By.id("fname")).sendKeys("Nagesh");
new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
new Select(driver.findElement(By.id("yearfgh"))).selectByVisibleText("1983");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@name='radiousername'])[3]")).click();
Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("nag1234");
		driver.findElement(By.id("repassword")).sendKeys("nag1234");
		driver.findElement(By.id("altemail")).sendKeys("nag@gmail.com");
		driver.findElement(By.id("mobileno")).sendKeys("7894561230");
		driver.findElement(By.id("imageField")).click();		
	}	
	@Test
	public void verifyLogin(){
		driver.findElement(By.id("f_id")).sendKeys("jan30selenium");
		driver.findElement(By.id("f_pwd")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.signin")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
	
}













