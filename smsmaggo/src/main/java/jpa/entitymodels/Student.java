package jpa.entitymodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "email", length = 50, nullable = false)
	private String sEmail;

	@Column(name = "name", length = 50, nullable = false)
	private String sName;

	@Column(name = "password", length = 50, nullable = false)
	private String sPass;
	
	@ManyToMany(targetEntity = Course.class, fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	private List<Course> sCourses;

	public Student() {
		this.sEmail = "";
		this.sName = "";
		this.sPass = "";
		this.sCourses = new ArrayList<>();

	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
	super();
	this.sEmail = sEmail;
	this.sName = sName;
	this.sPass = sPass;
	this.sCourses = sCourses;
}
	

//	public Set getCourseSet() {
//		return CourseSet;
//	}
//
//	public void setCourseSet(Set courseSet) {
//		CourseSet = courseSet;
//	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getSname() {
		return sName;
	}

	public void setSname(String sname) {
		this.sName = sname;
	}

	public String getSpassword() {
		return sPass;
	}

	public void setSpassword(String spassword) {
		this.sPass = spassword;
	}
	
	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}
	

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
	}
	

}