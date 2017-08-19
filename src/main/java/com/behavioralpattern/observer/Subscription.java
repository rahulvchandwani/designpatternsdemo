package com.behavioralpattern.observer;

// Subscription is Observable
public interface Subscription {
	
	void addSubscriber(Subscriber subscriber);
	
	void removeSubscriber(Subscriber subscriber);
	
	void notifySubscribers();
}
