package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegPage
 */

public class RegPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegPage() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  id=Integer.parseInt(request.getParameter("uid"));
		String name = request.getParameter("uname");
		int age= Integer.parseInt(request.getParameter("uage"));
		int salary= Integer.parseInt(request.getParameter("usalary"));
		String desig=request.getParameter("udesig");
		
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement stmt = con.prepareStatement("Insert into MyEmps Values(?,?,?,?,?)");
			stmt.setInt(1, id);
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
