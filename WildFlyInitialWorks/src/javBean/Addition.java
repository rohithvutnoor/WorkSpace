package javBean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
class Addition extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Addition() {
		super();
	}
	
	//@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Server at: ").append(req.getContextPath());
	}
	
	//@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer i = Integer.parseInt(req.getParameter("no1"));
		Integer j = Integer.parseInt(req.getParameter("no2"));
		resp.getOutputStream().println("<h2> Sum of 2 Numbers: "+(i+j)+"</h2>");
	}
}