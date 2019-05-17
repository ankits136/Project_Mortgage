package com.cts.model;

public class Employee {
private String empname;
private String empDesignation;
private String email;
private String password;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpDesignation() {
	return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
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

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String empname, String empDesignation, String email, String password) {
	super();
	this.empname = empname;
	this.empDesignation = empDesignation;
	this.email = email;
	this.password = password;
}


}
