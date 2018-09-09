package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Servlet implementation class ListDrugs
 */
@WebServlet("/ListDrugs")
public class ListDrugs extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static SessionFactory factory;
	
	String name , quantity;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListDrugs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String quantity=req.getParameter("quantity");
		
		
		
		  try {
		        
			  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	            
	        
	        factory = meta.getSessionFactoryBuilder().build();  
		      } catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		  
		  
		  
		  Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List patients = session.createQuery("FROM Drugs").list(); 
	         for (Iterator iterator = patients.iterator(); iterator.hasNext();){
	            Drugs patient = (Drugs) iterator.next(); 
	            this.name=patient.getName(); 
	            this.quantity=patient.getQuantity();
	           


	            
	           
	         
	            
	                resp.setContentType("text/html");  
	             	PrintWriter pw=resp.getWriter();
	            	//pw.write("<h1>Patients List</h1> <br>");
	            	pw.write(this.name);
	            	pw.write("  ");
	            	pw.write(this.quantity);
	            	
	            	pw.write("<br>");	
	            
	           
	            
	         }
	         
	        
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
