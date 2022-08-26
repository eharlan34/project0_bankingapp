package com.revature.controller;

import com.revature.services.models.User;

public interface UserLoginInterface {
	
	//Validate user input
	void login();
	
	User validateLogin(String username, String password);
	

}
