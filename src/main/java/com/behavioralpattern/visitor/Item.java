package com.behavioralpattern.visitor;

public interface Item {
	String accept(ShoppingCartVisitor visitor);
}
