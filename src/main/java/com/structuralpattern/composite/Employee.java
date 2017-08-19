package com.structuralpattern.composite;

import java.util.List;

public interface Employee {
	void add(Employee employee);
	
	void remove(Employee employee);
	
	List<Employee> getEmployees();
	
	String getName();
	
	double getSalary();
	
	void print();
}
