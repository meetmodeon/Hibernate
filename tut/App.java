package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	AlienName an=new AlienName();
    	an.setFname("Meet");
    	an.setMname("Kumar");
    	an.setLname("Yadav");
    	
    	Alien myself=new Alien();
    	myself.setAid(101);
    	myself.setColor("Green");
    	myself.setAname(an);
    	
//        myself.setAid(102);
//        myself.setAname("Jakesh");
//        myself.setColor("brown");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       
        
       SessionFactory sessionfacory=con.buildSessionFactory();
      
       Session session=sessionfacory.openSession();
       
       
       Transaction tx= session.beginTransaction();
//       myself=(Alien)session.get(Alien.class,101);
       
       session.save(myself);
       
       tx.commit();
       System.out.println(myself);
       
    }
}