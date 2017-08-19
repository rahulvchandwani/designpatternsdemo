package com.behavioralpattern.command;

// Receiver
public class Server {
	
	public void start() {
		System.out.println("Server started.");
	}
	
	public void stop() {
		System.out.println("Server stopped.");
	}
}
