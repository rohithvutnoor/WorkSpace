package cart;

import java.io.IOException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loadCart")
public class loadCart extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ArrayList<loadCart> list = new ArrayList<loadCart>();
	private String uname = null;
	private String name = null;
	int q;
	private double price;

	public loadCart(int q, String uname, String name, double price) {
		this.uname = uname;
		this.name = name;
		this.q = q;
		this.setPrice(price);
		list.add(this);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

/*	@WebMethod
	public void addToCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer q = Integer.parseInt(request.getParameter("quantity"));
		String pn = request.getParameter("productName");
		String un = request.getParameter("username");
		Integer p = 200;
		// Integer.parseInt(request.getParameter("price"));
		list.add(new loadCart(q, un, pn, p));
		// response.getOutputStream().println("<h2> Total Cost: "+"</h2>");
		// alert("");
	}*/

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * double sum = 0; for(Product p: list) { sum += (p.q*p.price);
		 * 
		 * }
		 */
		resp.getOutputStream().println("<h2> Total Cost: "  + "</h2>");
		// resp.getWriter().append("Server at: ").append(req.getContextPath());
	}

	 @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		Integer q = Integer.parseInt(request.getParameter("quantity"));
		String pn = request.getParameter("productName");
		String un = request.getParameter("username");
		double p = 200;
		// Integer.parseInt(request.getParameter("price"));
		list.add(new loadCart(q, un, pn, p));
		resp.getOutputStream().println("<h2> Items Added </h2>");
	}

}
