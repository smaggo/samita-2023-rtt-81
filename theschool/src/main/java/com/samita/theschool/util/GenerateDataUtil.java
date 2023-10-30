package com.samita.theschool.util;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samita.theschool.modal.Address;
import com.samita.theschool.modal.Cohort;
import com.samita.theschool.modal.Department;
import com.samita.theschool.modal.Department1M;
import com.samita.theschool.modal.Person;
import com.samita.theschool.modal.Teacher;
import com.samita.theschool.modal.Teacher1M;
import com.samita.theschool.modal.TeacherMM;

public class GenerateDataUtil {
	
	public void createDataManyTOOne() {
		// get database connection
		
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		
		
		// create departments
		
		Department dep = new Department();
		dep.setDeptName("IT");
		Department dep2 = new Department();
		dep2.setDeptName("HR");
		
		// create teacher
		
		Teacher t1 = new Teacher();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHasseb");
		
		Teacher t2 = new Teacher();
	    t2.setDepartment(dep);
		t2.setSalary("2200");
		t2.setTeacherName("Shahparan");
		
		Teacher t3 = new Teacher();
		 t3.setDepartment(dep2);
		t3.setSalary("3500");
		t3.setTeacherName("krista");
		
		Teacher t4 = new Teacher();
		 t4.setDepartment(dep2);
		t4.setSalary("4500");
		t4.setTeacherName("James");
		// storing Departments in database we use persist
		
		session.persist(dep);
		session.persist(dep2);
		
		// store Teacher
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
		t.commit();
		
		
	}
	
	public static void createDataOneToMany() {
		// get database connection
		
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
	     Teacher1M t1= new Teacher1M();
	     t1.setTeacherName("Haseeb");
	     t1.setSalary("9100");
	
	     Teacher1M t2= new Teacher1M();
	     t2.setTeacherName("shseseeb");
	     t2.setSalary("4100");
	
	     Teacher1M t3= new Teacher1M();
	     t3.setTeacherName("Mary");
	     t3.setSalary("3100");
	     
	     
	     Teacher1M t4= new Teacher1M();
	     t4.setTeacherName("Harshit");
	     t4.setSalary("2100");
	     

	     Teacher1M t5= new Teacher1M();
	     t5.setTeacherName("Mary");
	     t5.setSalary("3100");
	     // Add teacher entity object to a list
	     
	     List<Teacher1M>teacherList = new ArrayList<Teacher1M>();
	     teacherList.add(t1);
	     teacherList.add(t2);
	     teacherList.add(t3);
	     teacherList.add(t4);
	     teacherList.add(t5);
	     
	     session.persist(t1);
	     session.persist(t2); 
	     session.persist(t3);
	     session.persist(t4);
	     session.persist(t5);
	     
	    // create Department 
	     Department1M department = new Department1M();
	     department.setDeptName("Development");
	     department.setTeacherList(teacherList);
	     
	     //store department
	     session.save(department);
	     t.commit();
	     
	     
	     
	     
	}     
	     
	public static void createDataOneToOne() {
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		Address a1 = new Address();
		a1.setCity("NYC");
		a1.setState("NY");
		a1.setStreet("2th street");
		a1.setZipcode(123409);
		
		
		Address a2 = new Address();
		a2.setCity("atlanta");
		a2.setState("GA");
		a2.setStreet("27th street");
		a2.setZipcode(111409);
		
		
		Person p1 = new Person();
		p1.setAge("25");
		p1.setEmail("abf2gmail.com");
		p1.setName("jamy jones");
		p1.setAddress(a1);
		
		
		Person p2 = new Person();
		p2.setAge("28");
		p2.setEmail("agh2gmail.com");
		p2.setName("Mary jones");
		p2.setAddress(a2);
		
		session.persist(a1);
		session.persist(p1);
		session.persist(a2);
		session.persist(p2);
		t.commit();
	}

    public static void createDataManyToMany() {

		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		//----Create Cohort/class Entity set one----
    	Cohort Class1 = new Cohort("Java Developer", "14 weeks");
	Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
	Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
		//------  Store Cohort/ Class  --------
		session.persist(Class1);
		session.persist(Class2);
		session.persist(Class3);
		//-----Create Cohort/Class one --------
		Set<Cohort> ClassSet1 = new HashSet<Cohort>();
		ClassSet1.add(Class1);
		ClassSet1.add(Class2);
		ClassSet1.add(Class3);
		//-----Create Cohort/Class two --------
		Set<Cohort> ClassSet2 = new HashSet<Cohort>();
		ClassSet2.add(Class2);
		ClassSet2.add(Class3);
		ClassSet2.add(Class1);
		//-----Create Cohort/Class three --------
		Set<Cohort> ClassSet3 = new HashSet<Cohort>();
		ClassSet3.add(Class3);
		ClassSet3.add(Class1);
		ClassSet3.add(Class2);
		TeacherMM t1 = new TeacherMM("100", "Haseeb", ClassSet1);
		TeacherMM t2 = new TeacherMM("200", "Jenny", ClassSet2);
		TeacherMM t3 = new TeacherMM("200", "Charlie", ClassSet3);
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		t.commit();	 }


    }

