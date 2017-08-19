package com.creationalpattern.builder;

public class PersonBuilderTest {
	public static void main(String[] args) {
		Person person = new Person.PersonBuilder()
				.withFirstName("Rahul")
				.withLastName("Chandwani")
				.withAddress("Dubai")
				.withAge(25)
				.withEmail("rvc619@gmail.com")
				.withPhoneNumber("8801776766")
				.build();
		
		System.out.println(person);
	}
}
