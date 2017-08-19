package com.behavioralpattern.mediator;

public interface IGroupChat {
	void sendMessage(String message, User user);
	
	void addUser(User user);
}
