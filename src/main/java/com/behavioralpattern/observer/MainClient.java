package com.behavioralpattern.observer;

public class MainClient {
	
	public static void main(String[] args) {
		User user = new User("Rahul");
		
		Subscription subscription = new YoutubeSubscription();
		subscription.addSubscriber(user);
		subscription.notifySubscribers();
		user.setSubscription(subscription);
		
		user.watchVideo();
		user.unsubscribe();
		
	}
}
