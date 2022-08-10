import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo7WithOracle {

	public static void main(String[] args) {
		try 
		{
			
			//Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
			Statement stmt = con.createStatement();
			stmt.execute(" insert into MyEmps values(300,'Ramesh',45,40000,'CLERK')");
			stmt.close();con.close();
			System.out.println("Data Inserted....!");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
