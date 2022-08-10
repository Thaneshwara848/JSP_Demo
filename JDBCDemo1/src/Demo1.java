import java.util.Scanner;
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID :");
		int id= sc.nextInt();
		System.out.print("Enter Name :");
		String name= sc.next();
		System.out.print("Enter Age :");
		int age= sc.nextInt();
		System.out.print("Enter Salary ");
		float salary= sc.nextFloat();
		System.out.print("Enter Designation : ");
		String desig= sc.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into myEmployees values(?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setFloat(4,salary);
			stmt.setString(5, desig);
			stmt.execute();
			con.close();
			stmt.close();
			System.out.println("Data Inserted .....!");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
