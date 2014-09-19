package ioStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.testng.annotations.Test;
public class AddInputDataToResultXls {
  @Test
 public void step2() throws Exception{
//TAke input data from input file 2.Add printed data to Result file	  
FileInputStream fi=new FileInputStream(
				 "D:\\Workspace10AM\\Selenium_Autotest\\TestData\\Login.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
FileOutputStream fo=new FileOutputStream(
		   "D:\\Workspace10AM\\Selenium_Autotest\\Results\\LoginResults.xls");
WritableWorkbook wb=Workbook.createWorkbook(fo);
WritableSheet ws=wb.createSheet("Results", 0);
for (int i = 0; i < s.getRows(); i++) {
	for (int j = 0; j < s.getColumns(); j++) {
		System.out.println(s.getCell(j, i).getContents());	
		Label un=new Label(j, i, s.getCell(j, i).getContents());
		ws.addCell(un);
	}
 }
Label rs=new Label(2,0,"Result");
ws.addCell(rs);
wb.write();
wb.close();
  }
}













