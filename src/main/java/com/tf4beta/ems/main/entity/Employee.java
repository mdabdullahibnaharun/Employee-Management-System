package com.tf4beta.ems.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;

	@Column(name = "framework")
	private String framework;

	@Column(name = "salary")
	private String salary;

	@Column(name = "address")
	private String address;
	
	@Column(name = "joiningdate")
	private String joiningdate;
	
	@Column(name = "retireddate")
	private String retireddate;

	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, String email, String phone, String framework,
			String salary, String address, String joiningdate, String retireddate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.framework = framework;
		this.salary = salary;
		this.address = address;
		this.joiningdate = joiningdate;
		this.retireddate = retireddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getRetireddate() {
		return retireddate;
	}

	public void setRetireddate(String retireddate) {
		this.retireddate = retireddate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", framework=" + framework + ", salary=" + salary + ", address=" + address
				+ ", joiningdate=" + joiningdate + ", retireddate=" + retireddate + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", getFramework()=" + getFramework() + ", getSalary()="
				+ getSalary() + ", getAddress()=" + getAddress() + ", getJoiningdate()=" + getJoiningdate()
				+ ", getRetireddate()=" + getRetireddate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	

}