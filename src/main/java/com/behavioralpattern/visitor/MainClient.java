package com.behavioralpattern.visitor;

public class MainClient {
	
	public static void main(String[] args) {
		
		Book book = new Book("1", 150, 10);
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		System.out.println(visitor.getPrice(book));
		
		Fruit fruit = new Fruit("Banana", 150, 10);
		System.out.println(visitor.getPrice(fruit));
	}
}
