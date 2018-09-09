package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class DrugStore
 */
@WebServlet("/DrugStore")
public class DrugStore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 private static String name;

	   private static String quantity;
	   
	   private static SessionFactory factory;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrugStore() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Integer addDrug( String name, String quantity){
 	      Session session = factory.openSession();
 	      Transaction tx = null;
 	      Integer drugID = null;
 	      
 	      try {
 	         tx = session.beginTransaction();
 	         Drugs userid = new Drugs(name , quantity);
 	         drugID  = (Integer) session.save(userid);
 	         System.out.println(session.save(userid));
 	         tx.commit();
 	      } catch (HibernateException e) {
 	         if (tx!=null) tx.rollback();
 	         e.printStackTrace(); 
 	      } finally {
 	         session.close(); 
 	      }
 	      return drugID;
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
		
		
		
		name = request.getParameter("name");
		quantity  = request.getParameter("quantity");
		
	    
		try {
			  
	        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	     } catch (Throwable ex) { 
	   	  
	        System.err.println("Failed to create sessionFactory object." + ex);
	        throw new ExceptionInInitializerError(ex); 
	     }
	     
	     DrugStore MU = new DrugStore();  

	     Integer ID = MU.addDrug(name , quantity);
	     System.out.println(ID);
		
		
		
	}

}
