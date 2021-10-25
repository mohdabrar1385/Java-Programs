package com.inheritance.java;

public class Engineer extends Employee {
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public static void main(String args[])
	{
		Engineer e=new Engineer();
		e.setName("Abrar");
		e.setId(101);
		e.setSalary(200);
		e.setDesignation("Full Stack developer");
		System.out.println("Name is from Human Being:    "+e.getName());
		System.out.println("**************************************************");
		System.out.println("Id is from Employee:         "+e.getId());
		System.out.println("Salary is from Employee:     "+e.getSalary());
		System.out.println("**************************************************");
		System.out.println("Designtion is from Employee: "+e.getDesignation());
	}
}
