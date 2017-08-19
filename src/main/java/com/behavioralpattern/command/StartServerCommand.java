package com.behavioralpattern.command;

// Concrete Command
public class StartServerCommand implements Command {
	
	private Server server;
	
	public StartServerCommand(Server server) {
		this.server = server;
	}
	
	@Override
	public void execute() {
		server.start();
	}

}
