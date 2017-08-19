package com.creationalpattern.builder;

public class UserBuilder {
	
	private User user;

	private UserBuilder() {
		user = new User();
	}
	
	public static UserBuilder create() {
		return new UserBuilder();
	}
	
	public UserBuilder withFirstName(String firstName) {
		user.setFirstName(firstName);
		return this;
	}
	
	public UserBuilder withLastName(String lastName) {
		user.setLastName(lastName);
		return this;
	}
	
	public UserBuilder withAddress(String address) {
		user.setAddress(address);
		return this;
	}
	
	public UserBuilder withAge(int age) {
		user.setAge(age);
		return this;
	}
	
	public UserBuilder withEmail(String email) {
		user.setEmail(email);
		return this;
	}
	
	public UserBuilder withPhoneNumber(String phoneNumber) {
		user.setPhoneNumber(phoneNumber);
		return this;
	}
	
	public User build() {
		return user;
	}
}
