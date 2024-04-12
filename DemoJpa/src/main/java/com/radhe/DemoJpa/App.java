package com.radhe.DemoJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a=new Alien();
    	a.setAid(5);
    	a.setAname("Radhe");
    	a.setTech("BTech");
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
    	
    	
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    }
}
