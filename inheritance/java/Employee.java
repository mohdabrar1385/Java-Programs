package com.inheritance.java;

public class Employee extends HumanBeing {

	private int id;
	private double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setName("Abrar");
		e.setId(102);
		e.setSalary(100);
		
		System.out.println("Name is From Parent Class: "+e.getName());
		System.out.println("'Id is From Child Class: "+e.getId());
		System.out.println("Salary is From Child Class: "+e.getSalary());
	}

}
