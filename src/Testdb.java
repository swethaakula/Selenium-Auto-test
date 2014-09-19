import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Testdb {
	public  Connection connection;
	public  Statement statement;
	public  ResultSet resultSet;
	public void dbconnection()
	{
		try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
connection = DriverManager.getConnection("jdbc:sqlserver://MINDQ-PC;databasename=mq","test","test");
statement = connection.createStatement();
resultSet = statement.executeQuery("select * from emp where EMP='Nagesh'");
while (resultSet.next()) {  
    System.out.println("EMP Name :"+resultSet.getString("EMP"));
 //   System.out.println("EMP ID :"+resultSet.getInt("EMP ID"));
  }  
}catch(Exception e){e.printStackTrace();}		
}
public static void main(String[] args) throws Exception {
	Testdb t=new Testdb();
	t.dbconnection();

	}

}
//oracle.jdbc.driver.OracleDriver
//connection = DriverManager.getConnection("jdbc:sqlserver://MINDQ-PC;databasename=mq","setAuthentication=true");














