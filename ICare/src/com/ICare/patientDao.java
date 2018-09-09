package com.ICare;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class patientDao {

	public void addUserDetails(String userName, String cause, String gender, int age) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			patientProfile user = new patientProfile(userName, cause, gender, age);
			/*
			 * user.setPatientName(userName); user.setCa(password); user.setEmail(email);
			 * user.setCity(city); user.setPhone(phone);
			 */
			session.save(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
