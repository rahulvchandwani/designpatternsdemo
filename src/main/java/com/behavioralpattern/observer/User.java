package com.behavioralpattern.observer;

public class User implements Subscriber {
	
	private String name;
	private Subscription subscription;
	private boolean newVideoAvailable;
	
	public User(String name) {
		this.name = name;
	}
	
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public void setVideoAvailability(boolean available) {
		this.newVideoAvailable = available;
	}
	
	public void watchVideo() {
		if(this.newVideoAvailable) {
			System.out.println(this.name+" has watched the new video.");
		} else {
			System.out.println("No video available.");
		}
	}
	
	public void unsubscribe() {
		System.out.println(this.name+" has unsubscribed.");
		this.subscription.removeSubscriber(this);
	}
	
}
