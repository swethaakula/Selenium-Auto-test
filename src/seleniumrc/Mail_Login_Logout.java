package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;
public class Mail_Login_Logout {
private DefaultSelenium	selenium=new DefaultSelenium("localhost",1234,"*firefox","http://mail.in.com/");	
	public void openURL(){
		selenium.start();
		selenium.open("http://mail.in.com/");
		selenium.windowMaximize();	
	}
	public void login(){
		selenium.type("f_id", "jan30selenium");
		selenium.type("f_pwd", "selenium");
		selenium.click("css=input.signin");
		selenium.waitForPageToLoad("30000");
		selenium.windowFocus();
	}
	public void logout() throws Exception{
		selenium.click("link=Sign out");
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Mail_Login_Logout m=new Mail_Login_Logout();
		m.openURL();
		m.login();
		m.logout();
	}
}









