package com.creationalpattern.prototype;

public class FacebookUser extends User {

	@Override
	public void login(String userName, String password) {
		System.out.println("Facebook login successful...");
	}
}
