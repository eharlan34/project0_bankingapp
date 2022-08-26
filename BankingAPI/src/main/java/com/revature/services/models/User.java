package com.revature.services.models;

public abstract class User {
	
	protected String username;
	protected String password;
	protected String email;
	private String accountNumber;
	public Object getPassword;
	
	public User(String username, String password, String email, String accountNumber) {
		// TODO Auto-generated constructor stub
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.accountNumber = accountNumber;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
