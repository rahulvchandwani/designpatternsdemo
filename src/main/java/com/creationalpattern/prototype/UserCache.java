package com.creationalpattern.prototype;

import java.util.Hashtable;

public class UserCache {
	private static Hashtable<String, User> userMap = new Hashtable<>();
	
	public static User getUser(String userName) {
		User user = userMap.get(userName);
		return (User) user.clone();
	}
	
	public static void loadCache() {
		FacebookUser facebookUser = new FacebookUser();
		facebookUser.setUserName("rvc@facebook.com");
		facebookUser.setPassword("facebook123");
		userMap.put("rvc@facebook.com", facebookUser);
		
		TwitterUser twitterUser = new TwitterUser();
		twitterUser.setUserName("rvc@twitter.com");
		twitterUser.setPassword("twitter123");
		userMap.put("rvc@twitter.com", twitterUser);
		
		GoogleUser googleUser = new GoogleUser();
		googleUser.setUserName("rvc@google.com");
		googleUser.setPassword("google123");
		userMap.put("rvc@google.com", googleUser);
	}
}
