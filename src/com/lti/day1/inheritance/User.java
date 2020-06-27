package com.lti.day1.inheritance;

public class User {
	protected Integer userId;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String mobileNo;
	protected Address address;
	//User has-a address which is of type Address class
	//containment in java -object of another class as a property of our class
	public User() {
		System.out.println("User No-arg Constructor...invoked");
	}
	public User(Integer userId, String firstName, String lastName, String email, String mobileNo, Address address) {
		super();
		System.out.println("User Overloaded Constructor...invoked");
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId 
				+ ", firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", email=" + email
				+ ", mobileNo=" + mobileNo 
				+ ", address=" + address + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
