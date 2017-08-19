package com.behavioralpattern.command;

// Concrete Command
public class StopServerCommand implements Command {

	private Server server;
	
	public StopServerCommand(Server server) {
		this.server = server;
	}
	
	@Override
	public void execute() {
		server.stop();
	}

}
