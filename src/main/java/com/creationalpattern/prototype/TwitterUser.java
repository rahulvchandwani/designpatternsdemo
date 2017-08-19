package com.creationalpattern.prototype;

public class TwitterUser extends User {

	@Override
	public void login(String userName, String password) {
		System.out.println("Twitter login successful...");
	}
}
