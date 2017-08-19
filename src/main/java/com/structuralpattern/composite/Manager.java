package com.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	
	private String name;
	private double salary;
	private List<Employee> employees;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.employees = new ArrayList<>();
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public String getName() {
		return name;
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
