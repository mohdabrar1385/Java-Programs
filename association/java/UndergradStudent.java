package com.association.java;

public class UndergradStudent extends Student {
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void studentBranch()
	{
		Branch br=new Branch();
		br.studiesBranch();
	}
	public void studentSociety()
	{
		Society sc=new Society();
		sc.collegeSociety();
	}
}
