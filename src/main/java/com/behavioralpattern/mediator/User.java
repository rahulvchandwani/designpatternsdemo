package com.behavioralpattern.mediator;

public abstract class User {
	protected String name;
	protected IGroupChat groupChat;
	
	public User(String name, IGroupChat groupChat) {
		this.name = name;
		this.groupChat = groupChat;
	}
	
	public void send(String message) {
		System.out.println(this.name+" is sending message : "+message);
		groupChat.sendMessage(message, this);
	}
	
	public abstract void receive(String message);
}
