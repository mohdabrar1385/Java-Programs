package com.test3.java;

public class Employee {
	public int employeeId;
	public String employeeName;
	public double basicSalary;
	public double specialAllowance;
	public double hra;
	public double transportAllowance;
	public final double tax=2500;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	
	public void calculateNetSalary(double basicSalary)
	{
		double netSalary;
		if(basicSalary<=10000)
		{
			hra=basicSalary*0.2;
			specialAllowance=basicSalary*0.8;
			transportAllowance=basicSalary*0.2;
			netSalary=basicSalary+hra+specialAllowance+transportAllowance-tax;
			System.out.println("Net Salary is: "+netSalary+"\r\n");
		}
		else if(basicSalary>=10001 && basicSalary<=20000)
		{
			hra=basicSalary*0.2;
			specialAllowance=basicSalary*0.8;
			transportAllowance=basicSalary*0.2;
			netSalary=basicSalary+hra+specialAllowance+transportAllowance-tax;
			System.out.println("Net Salary is: "+netSalary+"\r\n");
		}
		else
		{
			hra=basicSalary*0.2;
			specialAllowance=basicSalary*0.8;
			transportAllowance=basicSalary*0.2;
			netSalary=basicSalary+hra+specialAllowance+transportAllowance-tax;
			System.out.println("Net Salary is: "+netSalary+"\r\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Abrar");
		e1.setBasicSalary(10000);
		
		e2.setEmployeeId(2);
		e2.setEmployeeName("Riya");
		e2.setBasicSalary(20000);
		
		e3.setEmployeeId(3);
		e3.setEmployeeName("Rahul");
		e3.setBasicSalary(25000);
		
		System.out.println("Basic Salary of "+e1.getEmployeeName()+" : "+e1.getBasicSalary());
		e1.calculateNetSalary(e1.getBasicSalary());
		
		System.out.println("Basic Salary of "+e2.getEmployeeName()+" : "+e2.getBasicSalary());
		e2.calculateNetSalary(e2.getBasicSalary());
		
		System.out.println("Basic Salary of "+e3.getEmployeeName()+" : "+e3.getBasicSalary());
		e3.calculateNetSalary(e3.getBasicSalary());
		
	}

}
