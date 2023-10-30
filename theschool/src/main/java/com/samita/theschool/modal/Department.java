package com.samita.theschool.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department implements Serializable{
	
	
	private static final long serialversion = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depid;
	private String deptName;
	
	
	public Department() {}


	public Department(int depid, String deptName) {
		super();
		this.depid = depid;
		this.deptName = deptName;
	}


	public int getDepid() {
		return depid;
	}


	public void setDepid(int depid) {
		this.depid = depid;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	@Override
	public String toString() {
		return "Department [depid=" + depid + ", deptName=" + deptName + "]";
	}
	
	
	
	
	

}
