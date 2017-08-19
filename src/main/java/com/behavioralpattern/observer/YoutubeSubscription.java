package com.behavioralpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSubscription implements Subscription {
	
	private List<Subscriber> subscribers = new ArrayList<>();
	
	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers() {
		System.out.println("Notifying all subscribers.");
		for(Subscriber subscriber : subscribers) {
			subscriber.setVideoAvailability(true);
		}
	}
	
	public void uploadNewVideo() {
		System.out.println("New video has been uploaded on the site.");
		notifySubscribers();
	}

}
