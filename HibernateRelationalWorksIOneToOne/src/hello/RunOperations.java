package hello;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunOperations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Configuration hibernateConfigs = new Configuration();
		hibernateConfigs.configure("hibernate.cfg.xml");
		try {
			SessionFactory sessionFactory = hibernateConfigs.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transacetion = session.beginTransaction();
			List<Customer> customers = (List<Customer>)session.createQuery("from Customer").list();
			for(Customer cust: customers) {
				System.out.println(cust);
			}
//			Bank bank = new Bank(1, "DBS", "Waverock, NanakramGoda");
//			session.save(bank);
			Address address = new Address(1, "62/135", "", "Anjaiah Nagar", "Hyderabad", "Telangana", "India", customers.get(0));
			session.save(address);
			transacetion.commit();
			session.close();
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
