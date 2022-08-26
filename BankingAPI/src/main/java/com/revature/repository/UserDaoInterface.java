package com.revature.repository;

import com.revature.services.models.User;

public interface UserDaoInterface {
	
	//CRUD
	//CREATE
	
	User createUser(User newUser);
	User createEmployee(User newEmployee);
	User createAdmin(User newAdmin);
	
	//READ
	
	User getUser(String username, String password);
	User getEmployee(String username, String password);
	User getAdmin(String username, String password);
	
	//UPDATE
	
	User updateUser(User updatedUser);
	User updateEmployee(User updatedUser);
	User updateAdmin(User updatedUser);
	
	//DELETE
	
	boolean deleteUser(User user);
	boolean deleteEmployee(User user);
	boolean deleteAdmin(User user);

}
