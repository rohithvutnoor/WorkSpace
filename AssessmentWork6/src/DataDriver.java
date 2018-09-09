import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataDriver {
	private static SessionFactory factory;

	public static void main(String[] args) {

		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		DataDriver driver = new DataDriver();

		/* Add few employee records in database */
		Integer p1 = driver.addPerson("Zara", "Hyd");
		Integer p2 = driver.addPerson("Daisy", "Hyd");
		Integer p3 = driver.addPerson("John", "Hyd");

		/* List down all the employees */
		driver.listEmployees();

		/* Update employee's records */
		driver.updateEmployee(p1, 5000);

		/* Delete an employee from the database */
		driver.deleteEmployee(p2);

		/* List down new list of the employees */
		driver.listEmployees();
	}

	/* Method to CREATE an employee in the database */
	public Integer addPerson(String fname, String addr) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();
			Person p = new Person(fname, addr);
			employeeID = (Integer) session.save(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to READ all the employees */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List persons = session.createQuery("FROM Employee").list();
			for (Iterator iterator = persons.iterator(); iterator.hasNext();) {
				Person p = (Person) iterator.next();
				System.out.print("First Name: " + p.getName());
				System.out.print("  Last Name: " + p.getAddress());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to UPDATE salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Person p = (Person) session.get(Person.class, EmployeeID);
			session.update(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to DELETE an employee from the records */
	public void deleteEmployee(Integer EmployeeID) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Person p = (Person) session.get(Person.class, EmployeeID);
			session.delete(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
