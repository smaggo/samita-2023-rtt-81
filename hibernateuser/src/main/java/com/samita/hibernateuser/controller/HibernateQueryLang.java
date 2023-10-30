package com.samita.hibernateuser.controller;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.samita.hibernateuser.model.User;
import com.samita.hibernateuser.util.HibernateUtil;

// this the class where we do hql query
public class HibernateQueryLang {
/**
 * 	FROM Clause in HQl
 */
	
	
	public void useFromClause() {
		Session session = HibernateUtil.getConnection();
		String hql = "FROM User" ;    //
		TypedQuery<User> query = session.createQuery(hql,User.class);
		List<User> results = query.getResultList();
		
		for(User u: results) {
			System.out.println("User Id:" +u.getId() +"|"+ "Full Name" + u.getFullname() +"Email" + u.getEmail()+" |"+"password" + u.getPassword());
		}
		
	/**
	 * 	Using WhereClause in HQL
	 */
		
		
	}
	  public void useWhereClause() {
		  Session session = HibernateUtil.getConnection();
		  String hql = "FROM User u WHERE u.id = 2";
		  TypedQuery<User>query = session.createQuery(hql,User.class);
		  List<User>results = query.getResultList();
	  }	  
		  
		public void useOrderByClause() {
			  Session session = HibernateUtil.getConnection();
			  String hql = "FROM User E WHERE E.id > 3  ORDER BY E.salary DESC";
			  TypedQuery<User>query = session.createQuery(hql,User.class);
			  List<User>results = query.getResultList();
			  for(User u: results) {
					System.out.println("User Id:" +u.getId() +"|"+ "Full Name" + u.getFullname() +"Email" + u.getEmail()+" |"+"password" + u.getPassword());
				}
			 	
	  
		  }
		  
	  
		  public void useGroupByClause() {
				Session session = HibernateUtil.getConnection();
				String hql = "SELECT SUM(U.salary), U.city FROM User U GROUP BY U.city";
				TypedQuery<Object[]> query = session.createQuery(hql, Object[].class);
				List<Object[]> result = query.getResultList();
				for(Object[] o : result) {
					System.out.println("Total salary: "+ o[0] + " | city: " + o[1]);
				}
				
		  }
			
		public void useNameParameters() {
				Session session = HibernateUtil.getConnection();
				String hql = "FROM User u WHERE u.id = :id";
				TypedQuery<User> query = session.createQuery(hql, User.class);
				query.setParameter("id", 4);
				List<User> result = query.getResultList();
				for (User u : result) {
				       System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getFullname() + "|" + "Email: " + u.getEmail() + "|" + "password" + u.getPassword());
				   }
				
				
		}
		
		public void getmaxsalary() {
			Session session = HibernateUtil.getConnection();
			String hql = "Select max(u.salary) FROM User u ";   // it is case sensitive always use same alias
			TypedQuery query = session.createQuery(hql);
			double result = (double) query.getSingleResult();
			System.out.println(result);
		}
		  
		  
		  }	  
		  
	 
		
		
		
		
	
	
	
	
	
	
	


