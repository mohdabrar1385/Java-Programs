package com.association.java;

public class HondaCar extends Car{
	public void hondaStartEngine()
	{
		CarEngine c=new CarEngine();
		
		c.engineStarts();
	}
	
	public void hondaMusicPlayer()
	{
		MusicPlayer m=new MusicPlayer();
		m.carMusicPlayer();
	}
}
