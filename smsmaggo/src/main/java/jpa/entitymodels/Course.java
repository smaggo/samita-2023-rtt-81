package jpa.entitymodels;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

@Entity
@Table
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")  // give name to id
    private int cId;	
	
	@Column(name = "name" , length = 50,nullable = false )
	private String cName;
	
	@Column(name = "Instructor", length = 50 , nullable = false)
	private String cInstructorName;
	
	public Course () {
        this.cName ="";
        this.cInstructorName = "";
	}

	public Course(Integer cId, String cName, String cInstructorName) {
		super();
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public Integer getId() {
		return cId;
	}

	public void setId(Integer id) {
		this.cId = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	@Override
	public String toString() {
		return "Course [id=" + cId + ", cName=" + cName + ", cInstructorName=" + cInstructorName + "]";
	}
        
}