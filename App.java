package com.telusko.myhibo;






import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Alien a=null;
		
		Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session1=sf.openSession();
		session1.beginTransaction();
		
		
		
		a=(Alien) session1.get(Alien.class,101);
		System.out.println(a);
		
		a=(Alien) session1.get(Alien.class,101);
		System.out.println(a);
		
		
		session1.getTransaction().commit();
		session1.close();
		
		Session session2=sf.openSession();
		session2.beginTransaction();
		
		
		
		a=(Alien) session2.get(Alien.class,101);
		System.out.println(a);
		
		a=(Alien) session2.get(Alien.class,101);
		System.out.println(a);
		
		
		session2.getTransaction().commit();
		session2.close();
//		
//		Alien a1=session.get(Alien.class,1);
//		
//		System.out.println(a1.getAname());
//		Collection<Laptop> laps=a1.getLaps();
//		
//		for(Laptop l:laps)
//		{
//			System.out.println(l);
//		}
//		
//		session.getTransaction().commit();
	}

}
