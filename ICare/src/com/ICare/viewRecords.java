package com.ICare;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


@WebServlet("/viewRecords")
public class viewRecords {
	String patientName,cause,gender;
	int age;
	private HttpSession session;
	private static SessionFactory factory;
	public viewRecords() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String patientName = request.getParameter("patientName");
		String cause = request.getParameter("cause");
		String gender = request.getParameter("gender");
		Integer age = Integer.parseInt(request.getParameter("age"));

		// session Creation
		try {

			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); // mapping
																														// hibernate
																														// config
																														// file.
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

			factory = meta.getSessionFactoryBuilder().build();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction(); // creating session
			List patients = session.createQuery("FROM Patient").list(); // saving the patients data in a list
			for (Iterator iterator = patients.iterator(); iterator.hasNext();) {
				patientProfile patient = (patientProfile) iterator.next();
				this.patientName = patient.getPatientName();
				this.cause = patient.getCause();
				this.age = patient.getAge();
				this.gender = patient.getGender();

				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				// Write the data
				pw.write(this.patientName); 
				pw.write(this.cause);
				pw.write(this.age);
				pw.write(this.gender);
				pw.write("<br>");

			}

			tx.commit();//SaveData
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().append("Server at: ").append(request.getContextPath());
	}
}
