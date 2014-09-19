package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin_Logout {
	public WebDriver driver;
	public void openURL(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	public void login() throws Exception{
		driver.findElement(By.id("Email")).sendKeys("jan30selenium");
		driver.findElement(By.id("Passwd")).sendKeys("selenium");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(4000);
	
	}
	public void logout(){
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div[2]/div[5]/div/a")).click();
		driver.findElement(By.id("gb_71")).click();
	}

	public static void main(String[] args) throws Exception {
		GmailLogin_Logout g=new GmailLogin_Logout();
		g.openURL();
		g.login();
		g.logout();
	}

}





