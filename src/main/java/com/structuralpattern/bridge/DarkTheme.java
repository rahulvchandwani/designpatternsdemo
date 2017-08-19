package com.structuralpattern.bridge;

public class DarkTheme implements Theme {

	@Override
	public void applyColor(String color) {
		System.out.println("Dark theme having "+color+" color.");
	}

	@Override
	public void addStyle(String style) {
		System.out.println(style+" style added in dark theme.");
	}
}
