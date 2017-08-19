package com.behavioralpattern.visitor;

public interface ShoppingCartVisitor {
	String getPrice(Fruit fruit);
	
	String getPrice(Book book);
}
