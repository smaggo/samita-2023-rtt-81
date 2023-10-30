
package com.samita.hibernatenamedquery.modal;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name = "Emplyoee" )
@NamedQuery (name = "getallEmployee", query = "Select e from Employee e " )
@NamedQueries({
	//@NamedQuery (name = "Get_Employee_by_id",query = "Select e.name ,e.salary from Employee e Where id =:id "),
	//@NamedQuery (name = "findEmployeeByName", query = "From Employee e where e.name = :name")
@NamedQuery (name = "EmpdeptAlias", query = " Select e , e.officecode ,  e.name CASE"
			+ "WHEN (e.employee id = '1')then 'ceo'"
			+"WHEN (e.employeeid = 3 )then 'Finance'"
			+"WHEN (e.employeeid = 4 )then 'Manager'"
			+"WHEN (e.employeeid = 5)then 'Developer'"
			+"WHEN (e.employeeid = 6 )then 'Tester'"
			+"WHEN (e.employeeid = 7 )then 'ProjectManager'"
			+ "ELSE 'General' END FROM Employee e  "),
			})

public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id ;
	private String name;
	private String job;
	private int salary;
	private String addressLine;
	private String zipcode;
	private String city;
	private LocalDate startDate;
	private int officecode;
	public Employee() {}
	public Employee(String name, String job, int salary, String addressLine, String zipcode, String city,
			LocalDate startDate, int officecode) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.addressLine = addressLine;
		this.zipcode = zipcode;
		this.city = city;
		this.startDate = startDate;
		this.officecode = officecode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public int getOfficecode() {
		return officecode;
	}
	public void setOfficecode(int officecode) {
		this.officecode = officecode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + ", addressLine="
				+ addressLine + ", zipcode=" + zipcode + ", city=" + city + ", startDate=" + startDate + ", officecode="
				+ officecode + "]";
	}
		
	
	
	
	
	
	}
	
	
	
	
	
	

