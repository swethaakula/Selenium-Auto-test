package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class GoogleLanguages {
//public DefaultSelenium selenium=new DefaultSelenium("localhost", 1234, "*firefox", "http://google.co.in");
public WebDriver driver=new FirefoxDriver();
public Selenium selenium=new WebDriverBackedSelenium(driver, "http://google.co.in");	
public void openURL(){
	//selenium.start();
	selenium.open("http://google.co.in");
	//selenium.windowMaximize();
}
public void english(){
	selenium.click("link=English");
}
public void hindi(){
	try{
		selenium.click("link=Hindi123");
		english();		
	}catch(Exception e){e.printStackTrace();}

}
public void bengali(){
	try{
		driver.findElement(By.linkText("Bengali")).click();
		english();		
	}catch(Exception e){e.printStackTrace();}
}
public void telugu(){
	selenium.click("link=Telugu");
	english();
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleLanguages g=new GoogleLanguages();
		g.openURL();
		g.hindi();
		g.bengali();
		g.telugu();
	}

}




