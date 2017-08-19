package com.structuralpattern.composite;

import java.util.List;

public class Developer implements Employee {
	
	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// Not Applicable
	}

	@Override
	public void remove(Employee employee) {
		// Not Applicable
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public List<Employee> getEmployees() {
		// Not Applicable
		return null;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("**********");
		System.out.println("Name : "+getName());
		System.out.println("Salary : "+getSalary());
		System.out.println("**********");
	}

}
