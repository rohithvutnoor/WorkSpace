package javBean;

import java.io.IOException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CartTotal")
public class Product extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Product> list = new ArrayList<Product>();
	private String name =null;
	int q ;
	private double price;
	
	public Product(int q, String name, double price) {
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
	@WebMethod
	public void addToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		Integer q = Integer.parseInt(request.getParameter("quantity"));
		String pn = request.getParameter("productName");
		Integer p = Integer.parseInt(request.getParameter("price"));
		list.add(new Product(q,pn,p));
		//response.getOutputStream().println("<h2> Total Cost: "+"</h2>");
		//alert("");
	}
	//@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*		double sum = 0;
		for(Product p: list) {
			sum += (p.q*p.price);
			
		}*/
		
//		resp.getWriter().append("Server at: ").append(req.getContextPath());
	}
	
	//@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double sum = 0;
		for(Product p: list) {
			sum += (p.q*p.price);
			
		}
		resp.getOutputStream().println("<h2> Total Cost: "+sum+"</h2>");
	}
}
