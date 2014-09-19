package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_MailIN {
	public WebDriver driver=new FirefoxDriver();
	public void openURL(){
		driver.get("http://mail.in.com");
	}
	public void regster() throws Exception{
		driver.findElement(By.cssSelector("input.registernow")).click();
		driver.findElement(By.id("fname")).sendKeys("Nagesh");
new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
new Select(driver.findElement(By.id("year"))).selectByVisibleText("1983");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@name='radiousername'])[3]")).click();
Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("nag1234");
		driver.findElement(By.id("repassword")).sendKeys("nag1234");
		driver.findElement(By.id("altemail")).sendKeys("nag@gmail.com");
		driver.findElement(By.id("mobileno")).sendKeys("7894561230");
		driver.findElement(By.id("imageField")).click();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Register_MailIN r=new Register_MailIN();
		r.openURL();
		r.regster();
	}

}



