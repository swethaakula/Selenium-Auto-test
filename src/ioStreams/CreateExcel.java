package ioStreams;
import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;
public class CreateExcel {
  @Test
  public void step1() throws Exception{
FileOutputStream fo=new FileOutputStream(
			   "D:\\Workspace10AM\\Selenium_Autotest\\Results\\LoginRes.xls");
WritableWorkbook wb=Workbook.createWorkbook(fo);
WritableSheet ws=wb.createSheet("Results", 0);
Label un=new Label(0,0,"USername");
Label pw=new Label(1,0,"Password");
Label rs=new Label(2,0,"Results");
ws.addCell(un);
ws.addCell(pw);
ws.addCell(rs);

wb.write();
wb.close();
  }
}










