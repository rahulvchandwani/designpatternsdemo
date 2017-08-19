package com.structuralpattern.bridge;

public class LightTheme implements Theme {
	
	public LightTheme() {

	}

	@Override
	public void applyColor(String color) {
		System.out.println("Light theme having "+color+" color.");
	}

	@Override
	public void addStyle(String style) {
		System.out.println(style+" style added in light theme.");
	}
}
