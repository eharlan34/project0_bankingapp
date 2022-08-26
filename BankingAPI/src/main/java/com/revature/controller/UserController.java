package com.revature.controller;

import java.util.Scanner;

import com.revature.services.UserLogIn;
import com.revature.services.models.User;

public class UserController implements UserInputInterface, UserLoginInterface{
	
	private Scanner sc;
	private UserLogIn userLogin;
	
	public UserController(Scanner sc, UserLogIn userLogin) {
		super();
		this.sc = sc;
		this.userLogin = userLogin;
	}

	@Override
	public User validateLogin(String username, String password) {
		
		if(username == null && password == null) {
			return null;
		}
		User user = userLogin.login(username, password);
		return user;
	}

	@Override
	public String getUserInput() {
		System.out.println("Hello! Please Input Something.");
		return sc.nextLine();
	}
	
	public void login() {
		System.out.println("Please login by typing your username and password \n");
		String username = getUserInput();
		String password = getUserInput();
		User user = validateLogin(username, password);
		
		if(user != null) {
			System.out.println("Login Successful");
			System.out.println(user);
		}else {
			System.out.println("Login Failed! Incorrect Username or Password.");
		}
	}
	

}
