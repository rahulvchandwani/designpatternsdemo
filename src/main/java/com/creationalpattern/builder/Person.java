package com.creationalpattern.builder;

public class Person {
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String email;
	private final String address;
	private final String phoneNumber;
	
	private Person(PersonBuilder personBuilder) {
		this.firstName = personBuilder.firstName;
		this.lastName = personBuilder.lastName;
		this.age = personBuilder.age;
		this.email = personBuilder.email;
		this.address = personBuilder.address;
		this.phoneNumber = personBuilder.phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	public static class PersonBuilder {
		private String firstName;
		private String lastName;
		private int age;
		private String email;
		private String address;
		private String phoneNumber;
		
		public PersonBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public PersonBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		
		public PersonBuilder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public PersonBuilder withPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Person build() {
			Person person = new Person(this);
			return person;
		}
	}
	
}


