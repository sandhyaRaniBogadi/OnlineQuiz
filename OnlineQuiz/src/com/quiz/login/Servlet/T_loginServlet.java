package com.quiz.login.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T_loginServlet
 */
@WebServlet("/T_loginServlet")
public class T_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public T_loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/jsp");
		PrintWriter out=response.getWriter();
		String un=request.getParameter("user");
		String pwd=request.getParameter("pass");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","root");
			PreparedStatement pst=conn.prepareStatement("select teachername,password from teacher");
			ResultSet  rs=pst.executeQuery(); 
			while(rs.next())
			{
				if(un.equals(rs.getString(1)) && pwd.equals(rs.getString(2)))
				{
					PreparedStatement psts=conn.prepareStatement("select subjectname from subject");
					ResultSet rss=psts.executeQuery();
					out.println("<h3>Select Subject</h3>");
					out.println("<form action=QuestionServlet.jsp method=post>");
					out.println("<p>subject:</p>");
					out.println("<select name=sub>");
					while(rss.next())
					{
						out.println("<option>"+rss.getString(1)+"</option>");
					}
					out.println("<select><br><br>");
					out.println("<input type=submit value=OK>");
					out.println("<input type=reset value=CANCEL><br>");	
				}
				
			}
			out.println("<a href=AddSubject.jsp>Add Subject</a>");
			out.println("<a href=DeleteSubject.jsp>Delete Subject</a>");
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

}
