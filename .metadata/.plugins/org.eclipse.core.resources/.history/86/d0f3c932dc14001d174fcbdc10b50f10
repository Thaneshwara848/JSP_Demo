import java.sql.*;
import java.util.Scanner;

public class Demo3WithMYSQL {
	public static void main(String[] args) {
		try 
		{	
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID ");
			int uid= sc.nextInt();
		
			System.out.println("Enmter Salary ");
			int salary= sc.nextInt();
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt = con.prepareStatement("update MyEmps  set salary = ? where id = ?");
			stmt.setInt(1, salary);
			stmt.setInt(2, uid);
				
			stmt.execute();
			stmt.close();con.close();
			System.out.println("Data Updated ....!");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

	}
