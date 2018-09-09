package dbs.hibernate.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAppAno {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernateconfig.xml");
		
		// creating session
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Student e1=new Student("surya","CSE");
		
		session.save(e1);
		
		t.commit();
		
		session.close();
		factory.close();
	}

}
