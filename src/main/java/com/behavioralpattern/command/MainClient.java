package com.behavioralpattern.command;

public class MainClient {
	
	public static void main(String[] args) {
		CommandPrompt commandPrompt = new CommandPrompt();
		Server server = new Server();
		
		Command startCommand = new StartServerCommand(server);
		commandPrompt.setCommand(startCommand);
		commandPrompt.clickEnter();
		
		Command stopCommand = new StopServerCommand(server);
		commandPrompt.setCommand(stopCommand);
		commandPrompt.clickEnter();
			
	}
}
