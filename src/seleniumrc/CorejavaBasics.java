package seleniumrc;

public class CorejavaBasics {
	public String str; //Declaration 
	//private String s;
	//protected String s1;
	public void sample1(){
		//String str; //Declaration 
		str="Nagesh"; //Assigning the value
		System.out.println("Welcome "+str);	
	}
	public void sample2(){
		//String str1="Rajesh";
		str="Rajesh";
		System.out.println("Welcome "+str);
	}
	public void sample3(){
		//String str2="Mahesh";
		str="Mahesh";
		System.out.println("Welcome "+str);	
	}
	public void sample4(String str4){
		System.out.println("Welcome "+str4); //Printing String 4
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CorejavaBasics c=new CorejavaBasics(); //instance or object
		c.sample4("Raj");
		c.sample4("Nagesh");
	}
}











