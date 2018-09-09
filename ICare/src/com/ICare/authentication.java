package com.ICare;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authentication")
public class authentication extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String admin = "rohith";
	static String passKey = "iCare123";

	public authentication() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Server at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ((username.equals(admin)) && (password.equals(passKey))) {
			request.setAttribute("name", username);
			request.getRequestDispatcher("adminDashboard.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.jsp");
			//request.getRequestDispatcher("index.jsp").forward(request, response);
		} 
		// response.getOutputStream().println("<h2></h2>");
	}
}
