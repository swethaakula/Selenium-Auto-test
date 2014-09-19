import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class TimeStamp {
  public static void main(String[] args) {
 
	   DateFormat d = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
	   Date dt = new Date();
	   String time=d.format(dt);
	   System.out.println(time);
 
  }
}