package com.behavioralpattern.visitor;

public class Book implements Item {
	
	private String isbnNumber;
	private int pricePerPiece;
	private int quantity;
	
	public Book(String isbnNumber, int pricePerPiece, int quantity) {
		this.isbnNumber = isbnNumber;
		this.pricePerPiece = pricePerPiece;
		this.quantity = quantity;
	}
	
	public String getIsbnNumber() {
		return isbnNumber;
	}

	public int getPricePerPiece() {
		return pricePerPiece;
	}
	
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String accept(ShoppingCartVisitor visitor) {
		return visitor.getPrice(this);
	}

}
