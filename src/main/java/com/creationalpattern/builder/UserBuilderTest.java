package com.creationalpattern.builder;

public class UserBuilderTest {
	public static void main(String[] args) {
		UserBuilder builder = UserBuilder.create();
		User user = builder.withFirstName("Rahul")
				.withLastName("Chandwani")
				.withAddress("Dubai")
				.withAge(25)
				.withEmail("rvc619@gmail.com")
				.withPhoneNumber("8801776766")
				.build();
		System.out.println("User Details : "+user);
	}
}
