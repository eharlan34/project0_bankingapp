package com.revature.services.models;

public class AccountHolder extends User implements UserInterface{
	public AccountHolder(String username, String password, String email, String accountNumber) {
		// TODO Auto-generated constructor stub
		super(username, password, email, accountNumber);
	}

	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return false;
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

}
