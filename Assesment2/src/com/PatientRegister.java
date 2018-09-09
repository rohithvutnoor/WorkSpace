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
 * Servlet implementation class Signin
 */
@WebServlet("/PatientRegister")
public class PatientRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientRegister() {
        super();
        // TODO Auto-generated constructor stub
    }
    
  
   

   private static SessionFactory factory;

   private static String fname;

   private static String lname;

   private static String age;

   private static String phone;
   
   private static String address;



   	

    public Integer addUser( String fname, String lname, String age , String phone , String address){
   	      Session session = factory.openSession();
   	      Transaction tx = null;
   	      Integer userID = null;
   	      
   	      try {
   	         tx = session.beginTransaction();
   	         patientProfile userid = new patientProfile(fname, lname, age ,  phone , address);
   	         userID  = (Integer) session.save(userid);
   	         System.out.println(session.save(userid));
   	         tx.commit();
   	      } catch (HibernateException e) {
   	         if (tx!=null) tx.rollback();
   	         e.printStackTrace(); 
   	      } finally {
   	         session.close(); 
   	      }
   	      return userID;
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
		
		
		fname = request.getParameter("firstname");
		lname  = request.getParameter("lastname");
		age = request.getParameter("age");
	    phone = request.getParameter("phone");
	    address = request.getParameter("address");
	    
	    
		try {
			  
	        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	     } catch (Throwable ex) { 
	   	  
	        System.err.println("Failed to create sessionFactory object." + ex);
	        throw new ExceptionInInitializerError(ex); 
	     }
	     
	     PatientRegister MU = new PatientRegister();  

	     Integer ID = MU.addUser(fname ,lname , age , phone,address);
	     System.out.println(ID);
		//doGet(request, response);
	}

}
