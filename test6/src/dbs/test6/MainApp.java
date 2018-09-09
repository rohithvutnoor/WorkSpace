package dbs.test6;

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
		
		Person e1=new Person("hafeez","vijaywada");
		
		session.save(e1);
		
		t.commit();
		
		session.close();
		System.out.println("Successfully saved");
		MainApp mp=new MainApp();
		for(Person e:mp.getPerson()) {
			System.out.println(e.toString());
		}
		//mp.UpdatePerson(1);
		//mp.DeletePerson(2);
		factory.close();
	}
	
	
	
	
	public List<Person> getPerson() {
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		List<Person> list=session.createQuery("FROM Person").list();
		
		
		t.commit();
		return list;
	}
	public void UpdatePerson(int id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Person temp=session.get(Person.class, id);
		temp.setName("appu");
		session.update(temp);
		t.commit();
		session.close();
	}
	public void DeletePerson(int id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Person temp=session.get(Person.class, id);
		session.delete(temp);
		t.commit();
		session.close();
	}
}
