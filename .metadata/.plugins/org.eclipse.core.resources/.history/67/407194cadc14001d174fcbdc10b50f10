import java.sql.*;
public class Demo1WIthMySQL {
	public static void main(String[] args) {
		
		
		try 
		{
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
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
