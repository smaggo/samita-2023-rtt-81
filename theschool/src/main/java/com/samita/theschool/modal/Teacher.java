package com.samita.theschool.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Teacher implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	// always generate annotation just above the intaliized variable....REMEMBER
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int teacherId;
	private String salary;
	private String teacherName;
	@ManyToOne
	@JoinColumn(name = "fk_deptid")
	private Department department;
	
	
	public Teacher() {}

	public Teacher(String salary, String teacherName) {
		super();
		this.salary = salary;
		this.teacherName = teacherName;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", salary=" + salary + ", teacherName=" + teacherName
				+ ", department=" + department + "]";
	}

	


	
	
	
	

}
