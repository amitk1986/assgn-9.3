package com.diablo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Evaluator
 */
@WebServlet("/Evaluator")
public class Evaluator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String fname = request.getParameter("byname");
		String i = request.getParameter("bymobile");
		String add = request.getParameter("byadd");
		PrintWriter pp = response.getWriter();
		if((fname=="" || !fname.equals("amit")) || (add =="" || !add.equals("mumbai"))|| (i=="" || !i.equals("8652181568")) )
				{
			pp.println("Login failed");
		} else{
			pp.println("Logged in successfully");
		}
	}

}
