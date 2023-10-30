package com.samita.hibernateuser.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hibernate connects to database  here  we are creating java doc
 */


public class HibernateUtil {
	/**
	 * Methods reads the hibernate.cfg.xml file. this is java doc
	 * and connects to the database
	 * @return
	 */
	
	
	
	public static Session getConnection() {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	return session;
	
	
	
	}
}
