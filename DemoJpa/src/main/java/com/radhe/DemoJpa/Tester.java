package com.radhe.DemoJpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Tester {
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		
		//To view all the data in the database;
		Query query=(Query)em.createQuery("from Employee");
		List<Employee> list=query.getResultList();
		
		for(Employee emp:list) {
			System.out.print("Id: "+emp.getId()+"-> ");
			System.out.println("Name: "+emp.getName());
		}
		
		//em.getTransaction().begin();
		
		//Insert data into data base using JPA
//		Employee emp=new Employee();
//		emp.setName("Radhe");
		
		//Update data from database
		Employee emp=em.find(Employee.class, 1);
//		System.out.println(emp.getName());
//		emp.setName("Laxminarayan");
//		
//		System.out.println("After Update id 1: "+emp.getName());
//		em.remove(emp);
//		System.out.println("Deleted id 1 successfully:");
//		
//		
//		em.persist(emp);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
	}

}
