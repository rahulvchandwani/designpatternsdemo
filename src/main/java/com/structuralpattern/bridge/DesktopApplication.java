package com.structuralpattern.bridge;

public class DesktopApplication extends Application {

	public DesktopApplication(Theme theme) {
		super(theme);
	}

	@Override
	public void login(String userName, String password, String color) {
		System.out.print("User login successful in desktop application with ");
		this.theme.applyColor(color);
	}

	@Override
	public void register(User user, String color) {
		System.out.print("User registered successfully in desktop application with");
		this.theme.applyColor(color);
	}
}
