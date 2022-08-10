<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String uid= request.getParameter("uid");
		String uname=  request.getParameter("uname");
 		String uage = request.getParameter("uage");
		String usalary = request.getParameter("usalary");
		String udesig = request.getParameter("udesig");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into myemps values(?,?,?,?,?)");
			stmt.setString(1,uid);
			stmt.setString(2,uname);
			stmt.setString(3,uage);
			stmt.setString(4,usalary);
			stmt.setString(5,udesig);
			stmt.execute();
			stmt.close();
			con.close();			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		

%>
HI My Name is : <%=uname %> and my Id is : <%=uid %> my Age is<%=uage%> and im getting slary <%=usalary  %> , my Designation is :<%=udesig %>
<a href="index.html">Click</a>


</body>
</html>