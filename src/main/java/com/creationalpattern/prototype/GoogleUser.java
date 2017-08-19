package com.creationalpattern.prototype;

public class GoogleUser extends User {

	@Override
	public void login(String userName, String password) {
		System.out.println("Google login successful...");
	}
}
