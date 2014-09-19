package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class Mail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DefaultSelenium	selenium=new DefaultSelenium("localhost",1234,"*firefox","http://mail.in.com/");	
selenium.start();
selenium.open("http://mail.in.com/");
selenium.windowMaximize();
selenium.type("f_id", "jan30selenium");
selenium.type("f_pwd", "selenium");
selenium.click("css=input.signin");
	}

}
