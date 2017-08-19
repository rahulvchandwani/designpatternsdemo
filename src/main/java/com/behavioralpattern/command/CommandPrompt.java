package com.behavioralpattern.command;

// Invoker
public class CommandPrompt {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void clickEnter() {
		command.execute();
	}
}
