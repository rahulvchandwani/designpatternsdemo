package com.behavioralpattern.mediator;

public class User2 extends User  {
	
	public User2(String name, IGroupChat groupChat) {
		super(name, groupChat);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("Message received by "+this.name+" is : "+message);
	}
}
