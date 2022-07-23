package hibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf  = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		student s1 = new student();
		s1.setId(1);
		s1.setName("janki");
		s1.setCity("ahmedabad");
		session.save(s1);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
