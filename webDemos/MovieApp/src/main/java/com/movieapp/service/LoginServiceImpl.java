package com.movieapp.service;

import java.util.stream.Stream;

import com.movieapp.controllers.LoginServlet;

public class LoginServiceImpl implements ILoginService {
	String[] usernames= {"John","Sri","Priya","Rahul","Joe"};
	@Override
	public boolean validateUsername(String username,String password) {
		return Stream.of(usernames)
		.filter(str->str.equals(username)&& password.equals("avvari123"))
		.findAny()
		.isPresent();
		
		
	}

	

}
