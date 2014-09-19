package Grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MailLogin_WD {
	public WebDriver driver;
	public void openURL() throws MalformedURLException{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver=new FirefoxDriver();
		driver.get("http://mail.in.com");
	}
	public void login(){
		driver.findElement(By.id("f_id")).sendKeys("swethagampa11");
		driver.findElement(By.id("f_pwd")).sendKeys("Swetha13");
		driver.findElement(By.cssSelector("input.signin")).click();
	}
	/*public void logout(){
		driver.findElement(By.linkText("Sign out")).click();
		driver.quit();
	}*/
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		MailLogin_WD m=new MailLogin_WD();
		m.openURL();
		m.login();
		//m.logout();
	}

}
