package jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentDao;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDao {

	
	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	    Query query = session.createQuery("select count(1) > 0 from Student where sEmail = :email and sPass = :pwd", Boolean.class);
	    query.setParameter("email", sEmail);
	    query.setParameter("pwd", sPassword);
				
		boolean found = (boolean) query.getSingleResult();	
				
		t.commit();
		factory.close();
		session.close();

		return found;
	}
	
	
	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		
		
		List<Course> studCourses = getStudentCourses(sEmail);
		
		boolean alreadyRegistered = false;
		
		for (Course course : studCourses) {
			
			if (cId == course.getId()) {
				alreadyRegistered = true;
				break;
			}
		}
		if (alreadyRegistered) {
			
			System.out.println("You are already registered in that course!");
		}
		
		else {
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			
	
		
			String insertQuery = "insert into student_course(student_email, sCourses_id) values (:email, :id) ";
			
			Query query = session.createNativeQuery(insertQuery);
		    query.setParameter("email", sEmail);
		    query.setParameter("id", cId);
		    
		    query.executeUpdate();
			
			t.commit();
			factory.close();
			session.close();
		}
			
	

	}

	public void createStudentTable() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Student student = new Student();
		t.commit();
		System.out.println("table created successfully");
		factory.close();
		session.close();
	}

	@Override
	public List<Student> getAllStudents() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	    Query query = session.createQuery("from Student", Student.class);
				
		List<Student> studentList = query.getResultList();		 
		t.commit();
		factory.close();
		session.close();
		
		return studentList;

	}


	@Override
	public List<Course> getStudentCourses(String sEmail) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	    Query query = session.createQuery("Select sCourses from Student where email = :email");
	    query.setParameter("email", sEmail);
	    
	    
	    List<?> resultRaw = query.list();
	    List<Course> result = new ArrayList<Course>(resultRaw.size());
	    for (Object o : resultRaw) {
	        result.add((Course) o);
	    }
		
		 
		t.commit();
		factory.close();
		session.close();
		
		return result;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	    Query<Student> query = session.createQuery("from Student where email=:email", Student.class);
	    query.setParameter("email", sEmail);
				
		Student stud = query.getSingleResult();		 
		t.commit();
		factory.close();
		session.close();
		
		return stud;
	}
}
