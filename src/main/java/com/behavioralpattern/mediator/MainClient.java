package com.behavioralpattern.mediator;

public class MainClient {
	
	public static void main(String[] args) {
		IGroupChat whatsappGroupChat = new WhatsappGroupChat();
		User user1 = new User1("Rahul", whatsappGroupChat);
		User user2 = new User2("Durgesh", whatsappGroupChat);
		
		whatsappGroupChat.addUser(user1);
		whatsappGroupChat.addUser(user2);
		
		user1.send("Hello 1");
	}
}
