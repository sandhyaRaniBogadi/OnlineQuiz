package com.quiz.login.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddQuestionSevlet
 */
@WebServlet("/AddQuestionSevlet")
public class AddQuestionSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddQuestionSevlet() {
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
		String x=request.getParameter("s1");
		String question=request.getParameter("question");
		String ans1=request.getParameter("ans1");
		String ans2=request.getParameter("ans2");
		String ans3=request.getParameter("ans3");
		String ans4=request.getParameter("ans4");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinequiz","root","root");
			PreparedStatement psts=conn.prepareStatement("Select subjectid from subject where subjectname=");
		
			PreparedStatement pst=conn.prepareStatement("insert into onlinequiz.question(questionname,subjectid) VALUES(?,?)");
			pst.setString(1, question);
		
			int rs=pst.executeUpdate(); 
	}
}
