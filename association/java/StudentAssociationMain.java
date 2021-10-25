package com.association.java;

public class StudentAssociationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndergradStudent ug1=new UndergradStudent();
		ug1.setName("Abrar");
		ug1.setRollNo(34);
		ug1.setCity("Hyderabad");
		ug1.setYear(4);
		ug1.studentBranch();
		ug1.studentSociety();
		System.out.println(ug1.getName());
		System.out.println(ug1.getRollNo());
		System.out.println(ug1.getCity());
		System.out.println(ug1.getYear());
		System.out.println("*********************");
		
		UndergradStudent ug2=new UndergradStudent();
		ug2.setName("Ahmed");
		ug2.setRollNo(15);
		ug2.setCity("Hyderabad");
		ug2.setYear(3);
		ug2.studentBranch();
		System.out.println(ug2.getName());
		System.out.println(ug2.getRollNo());
		System.out.println(ug2.getCity());
		System.out.println(ug2.getYear());
	}

}
