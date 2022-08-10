<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> My EMployees are : </h1>
<%

try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	Statement stmt= con.createStatement();
	ResultSet rs =stmt.executeQuery("Select * from myEmps");
	while(rs.next())
	{
		out.print(rs.getString(2));
		out.print("<br>");
	}
	stmt.close();
	con.close();			
}
catch(Exception e)
{
	System.out.print(e);
}
%>
</body>
</html>