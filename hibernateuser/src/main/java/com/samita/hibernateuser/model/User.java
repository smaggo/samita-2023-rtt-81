package com.samita.hibernateuser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TypedQuery;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samita.hibernateuser.util.HibernateUtil;
@NamedQueries({
	@NamedQuery(name = "updateMyuser",query = "UPDATE User SET fullName = :fullname WHERE id = :id")
})





@Entity   // it create file in our hibernate file
@Table(name= "users")
public class User {
	// make object integer type instead of primitive id
	@Column(name = "user_id")  // give name to id 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // identity provide primary key
   private Integer id;	
	
	
   private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;
	
	
	// create empty constructor
	public User ( ) {}


  // select constructor from constructor
	public User(String fullname, String email, String password, int age, double salary, String city) {
		super();
		this.fullname = fullname;
		this.email = email;  // 'this' refer to current object 
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	public void updateUser() {
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		TypedQuery<?> query = session.getNamedQuery("updateMyUser");
		query.setParameter("fullname", "Samita");
		query.setParameter("id",2);
		int rowsAffected = query.executeUpdate();
		System.out.println(rowsAffected + "");
	}

  // use source and select getter and setter
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
// use source and select to string method

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", age="
				+ age + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
