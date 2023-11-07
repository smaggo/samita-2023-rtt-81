package jpa.service;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDao;
import jpa.entitymodels.Course;

public class CourseService implements CourseDao {

	@Override
	public List<Course> getAllCourses() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

	    Query query = session.createQuery("from Course", Course.class);
				
		List<Course> courseList = query.getResultList();		 
		t.commit();
		factory.close();
		session.close();
		
		return courseList;

	}

}
