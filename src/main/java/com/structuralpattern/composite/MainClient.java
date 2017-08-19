package com.structuralpattern.composite;

public class MainClient {
	
	public static void main(String[] args) {
		Employee developer1 = new Developer("John", 10000);
		Employee developer2 = new Developer("Joe", 12000);
		Employee developer3 = new Developer("Jack", 15000);
		
		Employee manager = new Manager("Alastair", 25000);
		manager.add(developer1);
		manager.add(developer2);
		manager.add(developer3);
		
		Employee generalManager = new Manager("Patrick", 40000);
		generalManager.add(manager);
		
		generalManager.print();
		
		for(Employee managerEmp : generalManager.getEmployees()) {
			managerEmp.print();
			
			for(Employee developerEmp : managerEmp.getEmployees()) {
				developerEmp.print();
			}
		}
	}
}
