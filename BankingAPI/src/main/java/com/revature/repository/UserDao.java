package com.revature.repository;

import java.util.HashMap;
import java.util.Map;

import com.revature.services.models.AccountHolder;
import com.revature.services.models.Admin;
import com.revature.services.models.Employee;
import com.revature.services.models.User;

public class UserDao implements UserDaoInterface {
	public static Map<String, User> userData;
	
	public UserDao() {
		userData = new HashMap<>();
		userData.put("acctHldr1", new AccountHolder("acctHldr1", "pword1", "email1@bankapi.com", "C1C1C1C1"));
		userData.put("acctHldr2", new AccountHolder("acctHldr2", "pword2", "email2@bankapi.com", "C2C2C2C2"));
		userData.put("emply1", new Employee("emply1", "pwordE1", "emailE1@bankapi.com", "E1E1E1E1"));
		userData.put("emply2", new Employee("emply2", "pwordE2", "emailE2@bankapi.com", "E2E2E2E2"));
		userData.put("admin1", new Admin("admin1", "pwordA", "emailA@bankapi.com", "A1A1A1A1"));
	}

	public User createUser(User newUser) {
		return null;
	}

	public User getUser(String username, String password) {
		
		if(userData.containsKey(username) && userData.get(username).getPassword().equals(password)) {
			return userData.get(username);
	}
		return null;
	}
	
	@Override
	public User updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User createEmployee(User newEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createAdmin(User newAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmployee(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateAdmin(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmin(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
