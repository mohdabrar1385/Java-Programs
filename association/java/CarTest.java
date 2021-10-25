package com.association.java;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaCar hondaAmaze=new HondaCar();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(100);
		hondaAmaze.carDetails();
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		HondaCar hondaJazz=new HondaCar();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(150);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();
		hondaJazz.hondaMusicPlayer();
	}

}
