package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MailLogin_WD {
	public WebDriver driver;
	public void openURL(){
		driver=new FirefoxDriver();
		driver.get("http://mail.in.com");
	}
	public void login(){
		driver.findElement(By.id("f_id")).sendKeys("jan30selenium");
		driver.findElement(By.id("f_pwd")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.signin")).click();
	}
	public void logout(){
		driver.findElement(By.linkText("Sign out")).click();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailLogin_WD m=new MailLogin_WD();
		m.openURL();
		m.login();
		m.logout();
	}

}
