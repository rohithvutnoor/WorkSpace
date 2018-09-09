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
 * Servlet implementation class PatientList
 */
@WebServlet("/PatientList")
public class PatientList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static SessionFactory factory;
	
	String firstname , lastname , age , phone ,address;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName=req.getParameter("firstname");  //getting parametres from the jsp file.
		String lastName=req.getParameter("lastname");
		String age = req.getParameter("age");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		
		
		  try {
		        
			  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); //mapping hibernate config file.  
	            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	            
	        
	        factory = meta.getSessionFactoryBuilder().build();  
		      } catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		  
		  
		  
		  Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();    //creating session
	         List patients = session.createQuery("FROM Patient").list();  //saving the patients data in a list
	         for (Iterator iterator = patients.iterator(); iterator.hasNext();){
	            Patient patient = (Patient) iterator.next(); 
	            this.firstname=patient.getFname(); 
	            this.lastname=patient.getLname();
	            this.age=patient.getAge();
	            this.phone=patient.getPhone();
	            this.address = patient.getAddress();


	            
	           
	         
	            
	                resp.setContentType("text/html");  
	             	PrintWriter pw=resp.getWriter();
	            	//pw.write("<h1>Patients List</h1> <br>");
	            	pw.write(this.firstname);  //printing the data
	            	pw.write(this.lastname);
	            	pw.write(this.age);
	            	pw.write(this.phone);
	            	pw.write(this.address);
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
