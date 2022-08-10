import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4WithMYSQL {

	public static void main(String[] args) {
		try 
		{	
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID ");
			int uid= sc.nextInt();
		
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt = con.prepareStatement("delete from MyEmps where id = ?");
			
			stmt.setInt(1, uid);
				
			System.out.println("DO you Really wanmt to Delete the record ....? yes / no ");
			String op=sc.next();
			
			if(op.equalsIgnoreCase("Yes") || op.equalsIgnoreCase("y"))
			{
				stmt.execute();
				System.out.println("Data Deleted  ....!");
			}
			else
			{
				System.out.println("Not Deleted ...!");
			}
			stmt.close();con.close();
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
