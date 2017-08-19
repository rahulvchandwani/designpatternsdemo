package com.creationalpattern.prototype;

public class MainClient {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		UserCache.loadCache();
		
		User facebookUser = UserCache.getUser("rvc@facebook.com");
		System.out.println("Facebook password : "+facebookUser.getPassword());
		
		User twitterUser = UserCache.getUser("rvc@twitter.com");
		System.out.println("Twitter password : "+twitterUser.getPassword());
		
		User googleUser = UserCache.getUser("rvc@google.com");
		System.out.println("Google password : "+googleUser.getPassword());
	}
}
