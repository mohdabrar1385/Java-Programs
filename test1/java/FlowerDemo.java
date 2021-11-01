package com.test1.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerDemo {
	public static void displayFlower(String str)
	{
		switch(str)
		{
			case "ASIA" : displayAsia();
						  break;   
			case "EUROPE" : displayEurope();     
				 		  break;
			case "AFRICA" : displayAfrica();
						  break; 
			default:  System.out.println("Enter Valid Continent:");
		}
	}
	
	public static void displayAsia()
	{
		HashMap<String, String> asia=new HashMap<>();
		asia.put("India ", " LOTUS ");
		asia.put("Pakistan ", " JASMINE ");
		asia.put("Nepal ", " LALI GURANS ");
		System.out.println(asia+"\r\n");
		for(@SuppressWarnings("rawtypes") Map.Entry m : asia.entrySet())    
		    System.out.println("National Flower of "
		    		+ m.getKey()+" is "+m.getValue());
	}
	
	public static void displayEurope()
	{
		HashMap<String, String> europe=new HashMap<>();
		europe.put("Germany ", " CORN FLOWER ");
		europe.put("France ", " LILY ");
		europe.put("Greece ", " ACANTHUS MOLLIS ");
		System.out.println(europe+"\r\n");
		for(@SuppressWarnings("rawtypes") Map.Entry m : europe.entrySet())    
		    System.out.println("National Flower of "
		    		+ m.getKey()+" is "+m.getValue());
	}
	
	public static void displayAfrica()
	{
		HashMap<String, String> africa=new HashMap<>();
		africa.put("Egypt ", " BLUE LOTUS ");
		africa.put("Nigeria ", " YELLOW TRUMPET  ");
		africa.put("Kenya ", " ORCHID ");
		System.out.println(africa+"\r\n");
		for(@SuppressWarnings("rawtypes") Map.Entry m : africa.entrySet())    
		    System.out.println("National Flower of "
		    		+ m.getKey()+" is "+m.getValue());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter continent Name from the list: \r\n"
					+ "1.Asia\r\n"+"2.Europe\r\n"+"3.Africa\r\n"
					+"4.Exit");
			String str=sc.nextLine();
			if(str.toLowerCase().equals("exit"))
				System.exit(0);
			displayFlower(str.toUpperCase());
		}
	}

}
