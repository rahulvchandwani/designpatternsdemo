package com.behavioralpattern.servicelocator;

public class CabService implements Service {

	@Override
	public String getName() {
		return "CAB Service";
	}

	@Override
	public void execute() {
		System.out.println("Executing cab service...");
	}

}
