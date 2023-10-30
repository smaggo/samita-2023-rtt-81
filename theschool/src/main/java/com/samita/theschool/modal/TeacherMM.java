package com.samita.theschool.modal;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teachMM")
public class TeacherMM implements Serializable {
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String Teachername;
    private String salary;
    @ManyToMany(targetEntity = Cohort.class)
    private Set cohortset;
    
    
    public TeacherMM () {}
	public TeacherMM(String teachername, String salary, Set cohortset) {
		super();
		Teachername = teachername;
		this.salary = salary;
		this.cohortset = cohortset;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		Teachername = teachername;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Set getCohortset() {
		return cohortset;
	}
	public void setCohortset(Set cohortset) {
		this.cohortset = cohortset;
	}
	@Override
	public String toString() {
		return "TeacherMM [teacherId=" + teacherId + ", Teachername=" + Teachername + ", salary=" + salary
				+ ", cohortset=" + cohortset + "]";
	}
    
    
}
