package com.behavioralpattern.mediator;

public class User1 extends User  {
	
	public User1(String name, IGroupChat groupChat) {
		super(name, groupChat);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("Message received by "+this.name+" is : "+message);
	}
}
