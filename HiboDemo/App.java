package com.telusko.HiboDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");

		
		Student s=new Student();
		s.setName("Meet");
		s.setRollno(1);
		s.setMarks(50);
		s.getLaptop().add(laptop);
		
		laptop.getStudent().add(s);

		
		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//		ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegister();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		session.save(laptop);
		session.save(s);
		
		session.getTransaction().commit();
	}
} 
