<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String uid= request.getParameter("uid");		
		String usalary = request.getParameter("usalary");

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt=con.prepareStatement("update myemps set salary= ?  where id=? ");
			stmt.setString(1,usalary);
			
			stmt.setString(2,uid);
			
			stmt.execute();
			stmt.close();
			con.close();			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		

%>
<h1> udpated Succesfully </h1>

</body>
</html>