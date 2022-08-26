package com.revature.services.models;

public class Employee extends User implements UserInterface {

	public Employee(String username, String password, String email, String accountNumber) {
		super(username, password, email, accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return false;
	}

}
