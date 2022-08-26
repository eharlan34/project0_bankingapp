package com.revature;

import java.util.Scanner;

import com.revature.controller.UserController;
import com.revature.repository.UserDao;
import com.revature.repository.UserDaoInterface;
import com.revature.services.UserLogIn;

public class Driver {
	public static void main(String[] args) {
		UserDaoInterface userDao = new UserDao();
		UserLogIn userLogin = new UserLogIn(userDao);
		UserController userController = new UserController(new Scanner(System.in), userLogin);
		
		userController.login();
	}

}