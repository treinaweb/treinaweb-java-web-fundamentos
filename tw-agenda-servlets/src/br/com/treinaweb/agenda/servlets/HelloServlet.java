package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 917942103489487808L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Olá a partir do servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Olá mundo! Vim do servlet!</p>");
		out.println("</body>");
		out.println("</html>");
	}
	
}
