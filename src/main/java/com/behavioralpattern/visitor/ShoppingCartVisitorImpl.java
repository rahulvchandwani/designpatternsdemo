package com.behavioralpattern.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public String getPrice(Fruit fruit) {
		int price = fruit.getPricePerKg() * fruit.getQuantity();
		return ""+price;
	}

	@Override
	public String getPrice(Book book) {
		int price = book.getPricePerPiece() * book.getQuantity();
		
		// If the quantity exceeds 5, then give 10% discount
		if(book.getQuantity() > 5) {
			price -= price/10;
		}
		return ""+price;
	}

}
