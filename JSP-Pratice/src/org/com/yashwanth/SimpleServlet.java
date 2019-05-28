package org.com.yashwanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
//@WebServlet(description = "SimpleServlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Response from GET method");
//		PrintWriter writer = response.getWriter();
//		writer.println("Hello JSP");
//		response.getWriter().println("Hello get Response");
//		
//		
		response.setContentType("Welcome.html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		out.println("Hello" + user);
	}
	

}
