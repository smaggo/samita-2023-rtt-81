package com.samita.hibernateGlab.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SSSusersdb")
public class Suser {

	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id ; 
    private String fullname;
    private String email;
    private String password;
    private int age;
    private double salary;
    private String city;
    
    
	public Suser() {}


	public Suser(String fullname, String email, String password, int age, double salary, String city) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Suser [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", age="
				+ age + ", salary=" + salary + ", city=" + city + "]";
	}
		
	
	}
    

    
    
    
    
    
    
    
    
    
    
    
    
    
