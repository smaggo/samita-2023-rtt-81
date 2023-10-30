package com.samita.Departmentproject.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samita.Departmentproject.model.Department;

public class Departmentinf {
	public void createdepartmentTable() {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	

	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	
	
	Department person = new Department();
	t.commit();
	System.out.println("table created successfully");
	factory.close();
	session.close();
}
   public void createperson () {

	   SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Department one = new  Department("simi","Texas");
	    Department two = new Department("mini","Kentucky");
		Department three =new  Department("tim","Atlanta");
		session.persist (one);
		session.persist(two);
		session.persist(three);
		t.commit();
		System.out.println("saved");
		factory.close();
		session.close();
   }	
      // update method
   public void updateDepartment(int id) {
   SessionFactory factory = new Configuration().configure().buildSessionFactory();

	Session session = factory.openSession();
	Transaction t = session.beginTransaction();

	Department d = new Department();
	d.setId(id);
	d.setName("jany");
	d.setState("New york");
	session.merge (d);
	
	
   t.commit();  
	session.close();
	factory.close();
}
		// find method
  public void findDepartment(int id) {
   SessionFactory factory = new Configuration().configure().buildSessionFactory();

	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Department d = session.get(Department.class,id);
	System.out.println("name");
	System.out.println("id");
   
   t.commit();
   session.close();
   factory.close();
  }
   // delete method
   public void deleteDepartment(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Department d = new Department();
		  d.setId(id);
		  session.remove(d);
		  t.commit();
		  session.close();
		  factory.close();
   }
		
		
		
		
		
		
		
}
