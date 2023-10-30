package com.samita.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samita.hibernateuser.model.User;


/*
 * here we are creating service for the user
 */

public class UserService {
	// create method
	
	public void createUserTable() {
		// create session factory
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
	// create session factory object and transaction object
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		User user = new User();
		t.commit();
		System.out.println(" user table created successfully");
		factory.close();
		session.close();
	}
	
	public void createUser() {
	 	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			// way to add data Using setter method
			User uone = new User();
			uone.setEmail("hassed@gmail.com");
			uone.setFullname("Moh hassed");
			uone.setPassword("1255");
			uone.setSalary(2000.09);
			uone.setAge(20);
			uone.setCity("NYC");
			
			User uTwo = new User();
			uTwo.setEmail("James@gmail.com");
			uTwo.setFullname("James Santana");
			uTwo.setPassword("James123");
			uTwo.setSalary(2060.69);
			uTwo.setAge(25);
			uTwo.setCity("Dallas");
			
			
			User uThree = new User();
			uThree.setEmail("Shahparan@gmail.com");
			uThree.setFullname("AH Shahparan");
			uThree.setPassword("Shahparan123");
			uThree.setSalary(3060.69);
			uThree.setAge(30);
			uThree.setCity("Chicago");
			
			// another method to add is using constructor in User.java
			User ufour = new User("chisrt","chrita@gamil.com","c2345",35,3500.00,"Atlanta");
			User ufive = new User("sid","sidg@gamil.com","s346",27,3678.98,"Texas");
			
			session.persist(uone);
			session.persist(uTwo);
			session.persist(uThree);
			session.persist(ufour);
			session.persist(ufive);
			
			
			t.commit();
			System.out.println("Successfully saved");
			
			factory.close();
			session.close();
			
	}	
			// inserting Finduser method 
	
			public void findUser(int id) {
				SessionFactory factory = new Configuration().configure().buildSessionFactory();

				Session session = factory.openSession();
				Transaction t = session.beginTransaction();
				
				User u = session.get(User.class,id);
				System.out.println("Fullname"+u.getFullname());
				System.out.println("Email"+u.getEmail());
				System.out.println("Password"+u.getPassword());
				 
				t.commit();
				factory.close();
				session.close();
				
				
				
			}	
				// putting Update method
				public void updateUser(int id) {
				
					SessionFactory factory = new Configuration().configure().buildSessionFactory();

					Session session = factory.openSession();
					Transaction t = session.beginTransaction();
					User u = new User();
					u.setId(id);
					u.setFullname("jany");
					u.setEmail("jany@gamil.com");
					u.setPassword("j235");
					u.setCity("Atlanta");
					
					session.merge(u);
					
					
					session.getTransaction().commit();  // method chaining way
					session.close();
					factory.close();
				
				
				}	
				// creating delete method
				public void deleteUser(int id) {
					SessionFactory factory = new Configuration().configure().buildSessionFactory();

					Session session = factory.openSession();
					Transaction t = session.beginTransaction();
					  User u = new User();
					  u.setId(id);
					  session.remove(u);
					  t.commit();
					  session.close();
					  factory.close();
					
					
					
					
					
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	
	
	


