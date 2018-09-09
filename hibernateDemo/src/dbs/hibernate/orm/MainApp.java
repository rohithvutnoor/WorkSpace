package dbs.hibernate.orm;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	private static SessionFactory factory; 
	public static void main(String[] args) {
		
		// creating conf
		Configuration conf=new Configuration();
		conf.configure("hibernateconfig.xml");
		
		// creating session
		factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee("surya","kosaraju");
		
		session.save(e1);
		
		t.commit();
		
		session.close();
		System.out.println("Successfully saved");
		MainApp mp=new MainApp();
		for(Employee e:mp.getEmployee()) {
			System.out.println(e.toString());
		}
		
		factory.close();
	}
	
	public List<Employee> getEmployee() {
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		List<Employee> list=session.createQuery("FROM Employee").list();
		
		
		t.commit();
		return list;
	}
	public void UpdateEmployee(int id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee temp=session.get(Employee.class, id);
		temp.setFirstName("appu");
		session.update(temp);
		t.commit();
		session.close();
	}
	public void DeleteEmployee(int id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee temp=session.get(Employee.class, id);
		session.delete(temp);
		t.commit();
		session.close();
	}
}
