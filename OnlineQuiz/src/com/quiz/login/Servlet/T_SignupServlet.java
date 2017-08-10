package com.quiz.login.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T_SignupServlet
 */
@WebServlet("/T_SignupServlet")
public class T_SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public T_SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/jsp");
		PrintWriter out=response.getWriter();
		/*@SuppressWarnings("unused")*/
		String un=request.getParameter("user");
		String pwd=request.getParameter("pass");
		String phone=request.getParameter("phno");
		String em=request.getParameter("email");
		String dob=request.getParameter("dob");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","root");
			PreparedStatement pst=conn.prepareStatement("insert into onlinequiz.teacher(teachername,password,phonenumber,emailid,dob) VALUES(?,?,?,?,?)");
			pst.setString(1, un);
			pst.setString(2, pwd);
			pst.setString(3, phone);
			pst.setString(4, em);
			pst.setString(5, dob);
			int rs=pst.executeUpdate(); 
			if(rs>0)
			{
				out.println("Details added Successfully"+"\n");
				out.println("User Name is: "+un+"\n");
				out.println(" Password is: "+pwd+"\n");
				out.println("phone number: "+phone+"\n");
				out.println(" Email-id is: "+em+"\n");
				out.println("Date of Birth is: "+dob+"\n");
				RequestDispatcher rd=request.getRequestDispatcher("T_login.jsp");
				rd.forward(request, response);
	
			}
			else
			{
				out.println("ERROR");
			}
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
