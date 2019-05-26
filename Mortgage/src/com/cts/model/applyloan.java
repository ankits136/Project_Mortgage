package com.cts.model;

public class applyloan {
	private Integer applicationId;
private String emailId;
private Long loanamount;
private String panId;
private String AadharId;
private Long propertyvalue;
private String status;



public Integer getApplicationId() {
	return applicationId;
}
public void setApplicationId(Integer applicationId) {
	this.applicationId = applicationId;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Long getLoanamount() {
	return loanamount;
}
public void setLoanamount(Long loanamount) {
	this.loanamount = loanamount;
}
public String getPanId() {
	return panId;
}
public void setPanId(String panId) {
	this.panId = panId;
}
public String getAadharId() {
	return AadharId;
}
public void setAadharId(String aadharId) {
	AadharId = aadharId;
}
public Long getPropertyvalue() {
	return propertyvalue;
}
public void setPropertyvalue(Long propertyvalue) {
	this.propertyvalue = propertyvalue;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public applyloan() {
	super();
	// TODO Auto-generated constructor stub
}

public applyloan(Integer applicationId, String emailId, Long loanamount, String panId, String aadharId,
		Long propertyvalue, String status) {
	super();
	this.applicationId = applicationId;
	this.emailId = emailId;
	this.loanamount = loanamount;
	this.panId = panId;
	AadharId = aadharId;
	this.propertyvalue = propertyvalue;
	this.status = status;
}
@Override
public String toString() {
	return "applyloan [applicationId=" + applicationId + ", emailId=" + emailId + ", loanamount=" + loanamount
			+ ", panId=" + panId + ", AadharId=" + AadharId + ", propertyvalue=" + propertyvalue + ", status=" + status
			+ "]";
}




}
