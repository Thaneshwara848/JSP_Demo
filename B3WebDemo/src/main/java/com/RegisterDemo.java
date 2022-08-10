package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterDemo
 */

public class RegisterDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid=request.getParameter("uid");
		String  uname= request.getParameter("uname");
		String  uage = request.getParameter("uage");
		String usalary = request.getParameter("usalary");
		String udesig= request.getParameter("udesig");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			stmt.setString(1, uid);
			stmt.setString(2, uname);
			stmt.setString(3, uage);
			stmt.setString(4, usalary);
			stmt.setString(5, udesig);
			stmt.execute();
			con.close();		
			System.out.println("Data Inserted succsfully....!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
