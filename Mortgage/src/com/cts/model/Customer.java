package com.cts.model;

import java.util.Date;

public class Customer {
	private int customerId;
	private String name;
	private String emailId;
	private String mobileNumber;
	private Date dob;
	private String pswd;
	
	private String city;
	private String state;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Customer(int customerId, String name, String emailId, String mobileNumber, Date dob, String pswd,
			String city, String state) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.pswd = pswd;
		this.city = city;
		this.state = state;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + ", dob=" + dob + ", pswd=" + pswd + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
}
