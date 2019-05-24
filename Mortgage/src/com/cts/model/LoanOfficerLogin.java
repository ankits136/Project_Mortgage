package com.cts.model;
public class LoanOfficerLogin {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setUsername(String email) {
		email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoanOfficerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanOfficerLogin(String email, String password) {
		super();
		 this.email= email;
		this.password = password;
	}
	
	
	
}
