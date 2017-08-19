package com.behavioralpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class WhatsappGroupChat implements IGroupChat {
	
	private List<User> users;
	
	public WhatsappGroupChat() {
		users = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User currentUser : users) {
			if(currentUser != user) {
				currentUser.receive(message);
			}
		}
	}

}
