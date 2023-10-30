package com.samita.Departmentproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Dept" )
	public class Department {

	
	@Column (name = "dept_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id;	
		private String name;
		private String state;
		
	  
		
		
		
		// create empty constructor
		public Department ( ) {}





	


		public Department(String name, String state) {
			super();
			this.name = name;
			this.state = state;
		}








		public Integer getId() {
			return id;
		}








		public void setId(Integer id) {
			this.id = id;
		}








		public String getName() {
			return name;
		}








		public void setName(String name) {
			this.name = name;
		}








		public String getState() {
			return state;
		}








		public void setState(String state) {
			this.state = state;
		}








		@Override
		public String toString() {
			return "Department [id=" + id + ", name=" + name + ", state=" + state + "]";
		}








		
		}








	
			
		
