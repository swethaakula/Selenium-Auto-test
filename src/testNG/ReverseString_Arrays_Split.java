package testNG;

import org.testng.annotations.Test;

public class ReverseString_Arrays_Split {
  @Test(enabled=false)
  public void f() {
	  String str="Nagesh";
	  System.out.println(str.length());
/*	 for(int i=0; i<str.length(); i++)
	 {
		 System.out.println(str.charAt(i)); 
	 }*/
	  
	  for(int i=5; i>=0; i--)
	  {
		  System.out.println(str.charAt(i));
	  }

  }
  @Test(enabled=false)
  public void arrays(){
	  String[] str1={"nagesh","Mahesh","Suresh","one","two"};
	  System.out.println(str1.length);
for (int i = 0; i < str1.length; i++) {
	//System.out.println(str1[i]);
	if(str1[i].equalsIgnoreCase("suresh"))
	{
		System.out.println(str1[i]);
	}
}
	  
  }
  @Test
  public void splits(){
	String str="nagesh,Mahesh,Suresh,one,two";
	String str1[]=str.split(",");
	System.out.println(str1.length);
for (int i = 0; i < str1.length; i++) {
	//System.out.println(str1[i]);
	if(str1[i].equalsIgnoreCase("suresh"))
	{
		System.out.println(str1[i]);
	}
}
	
  }
}
















