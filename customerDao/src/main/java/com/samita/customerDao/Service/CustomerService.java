package com.samita.customerDao.Service;


public class CustomerService {

	public static Session getConnection() {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	return session;
	
}
