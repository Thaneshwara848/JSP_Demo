import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class Demo2WIthMySQL {
	public static void main(String[] args) {
		try 
		{	
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID ");
			int uid= sc.nextInt();
			
			System.out.println("Enter name ");
			String name= sc.next();
			
			System.out.print("Entyer Age : ");
			int age= sc.nextInt();
			
			System.out.println("Enmter Salary ");
			int salary= sc.nextInt();
			
			System.out.println("Enter Designation :");
			String desig = sc.next();

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt = con.prepareStatement("Insert into MyEmps Values(?,?,?,?,?)");
			stmt.setInt(1, uid);
			stmt.setString(2, name);
			stmt.setInt(3,age);
			stmt.setInt(4, salary);
			stmt.setString(5, desig);	
			stmt.execute();
			stmt.close();con.close();
			System.out.println("Data Inserted....!");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
