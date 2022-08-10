import java.util.*;
import java.sql.*;
public class Emp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		
		System.out.println("Enter name : ");
		String  name=sc.next();
		
		System.out.println("Enter Age : ");
		int  age = sc.nextInt();
		
		System.out.println("Enter Salary : ");
		int sal = sc.nextInt();
		
		System.out.println("ENter Designation : ");
		String  desig = sc.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setInt(4, sal);
			stmt.setString(5, desig);
			stmt.execute();
			con.close();		
			System.out.println("Data Inserted succsfully....!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
