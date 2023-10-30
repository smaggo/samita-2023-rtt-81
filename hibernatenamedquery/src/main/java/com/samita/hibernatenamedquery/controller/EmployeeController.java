package com.samita.hibernatenamedquery.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.samita.hibernatenamedquery.modal.Employee;

// this code will generate Employee table in the database ..here db is "company"
public class EmployeeController {
  public void createEmployeeTable() {
	  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session .beginTransaction();
	  
	  Employee uone = new Employee();
	  t.commit();
	  System.out.println(" Table created");
	  factory.close();
	  session.close();
  }
	 public void createUser() {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		 
		 Employee one = new Employee ( "Tom", "Ceo", 25600, "123abc street" , "11102","Atlanta", LocalDate.of( 2023 , Month.JANUARY , 1 ) , 1);
		 Employee two = new Employee ( "Tamy", "Finance", 35467, "876abc street" , "11103","Texas", LocalDate.of( 2023 , Month.FEBRUARY , 18 ) , 2);
		 Employee three = new Employee ( "Mary", "Manager", 28670, "456abc street" , "11104","Chicago", LocalDate.of( 2022 , Month.FEBRUARY , 23 ) , 3);
		 Employee four = new Employee ( "Jaany", "Developer", 26500, "345abc street" , "11105","Arizona", LocalDate.of( 2023 , Month.JULY , 16) , 4);
		 Employee five = new Employee ( "Tania", "Tester", 19670, "345abc street" , "11106","Kentucky", LocalDate.of( 2023 , Month.JUNE , 11 ) , 5);
		 Employee six = new Employee ( "Maira", "ProjectManager", 24600, "678abc street" , "11107","Atlanta", LocalDate.of( 2022 , Month.OCTOBER ,6),6 );
		 
		 session.persist(one);
		 session.persist(two);
		 session.persist(three);
		 session.persist(four);
		 session.persist(five);
		 session.persist(six);
		 t.commit();
		 factory.close();
		 session.close();
		 
	 }
	 
	 public void findEmployeeByName() {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		  Transaction t = session .beginTransaction();
		 //---hinbernate named query----//
		  TypedQuery query = session.getNamedQuery("findEmployeeByName");
		  query.setParameter("name", "Mary");
		  List<Employee> employees = query.getResultList();
		  Iterator<Employee>itr = employees.iterator();
		  while (itr.hasNext()) {
			Employee e = itr.next() ;
			System.out.println(e);
		  }
		  factory.close();
		  session.close();
		  
	 }
	/* public void findEmployeeById() {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		  Transaction t = session .beginTransaction();
		  TypedQuery query = session.getNamedQuery("Get_Employee_By_id");
		  query.setParameter("id", "3");
		  List<Object[]>emName = query.getResultList();
		  for (Object o :emName)
		  { System.out.println("Employee name: " +o[0] +" | Employee Salary: "+ o[1]  );
	 }
	 factory.close();
	 session.close();
	 } */
	  
	 public void ShowOfficeCodes_AsDepartment(){
	 {
SessionFactory factory = new Configuration().configure().buildSessionFactory();
 Session session = factory.openSession();
 TypedQuery query = session.getNamedQuery("empdepAlias");
 List<Object[]>list= query.getResultList();

//------------  Hibernate Named Query   ------------- 
 

for(Object[] e: list )
 {
 System.out.println("OfficeCode: " + e[1] + " | Dep Name: " +e[3]+ " | Employee Name: " + e[2]);
}
	factory.close();  
	session.close(); 
	 }
	 }
}
	 
	 


  
  



	
	
	
	
	

