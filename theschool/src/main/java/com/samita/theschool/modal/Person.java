package com.samita.theschool.modal;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int personId;
  private String name;
  private String email;
  private String age;
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  
  public Person() {}

public Person(String name, String email, String age, Address address) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.address = address;
}

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Person [personId=" + personId + ", name=" + name + ", email=" + email + ", age=" + age + ", address="
			+ address + "]";
}
  
}
