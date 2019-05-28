package org.com.yashwanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XMLconfigurationServlet extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		String user = request.getParameter("user");
//		out.println("Hello " +  user);
//	
//	}
	

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String  EmailId = request.getParameter("Email");
		
		out.println(" Hello " +  FirstName  + " " +  LastName + " Your EmailId is " + EmailId );
		
		
	}
	}


