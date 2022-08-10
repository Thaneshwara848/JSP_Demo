import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Demo6 {

			public static void main(String[] args) {

				try 
				{		
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
					Statement stmt = con.createStatement();
					
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter Id to DISPLAY ? ");
					int id = sc.nextInt();
					ResultSet rs = stmt.executeQuery("select * from MyEmps ");
					while(rs.next()) {
						if(rs.getInt(1)== id)
						{
								System.out.println(rs.getInt(1)+ " : "+rs.getString(2)+ " : "+
							 	rs.getInt(3)+" : "+rs.getInt(4)+" : "+rs.getString(5));
						}
					}
					stmt.close();con.close();
				}
				catch (Exception e) 
				{
					System.out.println(e);
				}
				
			}
		}


