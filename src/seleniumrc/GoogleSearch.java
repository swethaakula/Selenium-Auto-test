package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class GoogleSearch {
	
	//This is google search program
	
public static void main(String[] args) {
DefaultSelenium	selenium=new DefaultSelenium("localhost",1234,"*firefox","http://");
selenium.start();
selenium.open("http://google.co.in");
selenium.windowMaximize();
selenium.type("gbqfq", "selenium");
selenium.click("gbqfb");

	}

}












