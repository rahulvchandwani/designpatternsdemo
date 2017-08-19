package com.structuralpattern.bridge;

public class MainClient {
	
	public static void main(String[] args) {
		
		Application desktopApplicationWithLightTheme = new DesktopApplication(new LightTheme());
		desktopApplicationWithLightTheme.login("rahul", "12345", "Red");
		desktopApplicationWithLightTheme.register(new User(), "RED");
		
		Application desktopApplicationWithDarkTheme = new DesktopApplication(new DarkTheme());
		desktopApplicationWithDarkTheme.login("rahul", "12345", "Blue");
		desktopApplicationWithDarkTheme.register(new User(), "BLUE");
		
		System.out.println("****************************************************");
		
		Application webApplicationWithLightTheme = new WebApplication(new LightTheme());
		webApplicationWithLightTheme.login("rahul", "12345", "Yellow");
		webApplicationWithLightTheme.register(new User(), "YELLOW");
		
		Application webApplicationWithDarkTheme = new WebApplication(new DarkTheme());
		webApplicationWithDarkTheme.login("rahul", "12345", "Green");
		webApplicationWithDarkTheme.register(new User(), "GREEN");
	}
}
