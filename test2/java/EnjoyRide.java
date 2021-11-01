package com.test2.java;

import java.util.Scanner;

public class EnjoyRide {
	
	public static int noOfHours; 
	public static void aliBaba(int noOfAdults, int noOfChildren)
	{
		System.out.println("Total hrs of ride: "+ noOfHours);
		
		double adult_ride_fare=noOfAdults*noOfHours*50;
		System.out.println("adult ride fare: "+ adult_ride_fare);
		
		double child_ride_fare=noOfChildren*noOfHours*40;
		System.out.println("child ride fare: "+ child_ride_fare);
		
		double total_amount=adult_ride_fare+child_ride_fare;
		System.out.println("Total Amount: "+total_amount);
	}
	
	public static void alpineSlide(int noOfAdults, int noOfChildren)
	{
		System.out.println("Total hrs of ride: "+ noOfHours);
		
		double adult_ride_fare=noOfAdults*noOfHours*60;
		System.out.println("adult ride fare: "+ adult_ride_fare);
		
		double child_ride_fare=noOfChildren*noOfHours*30;
		System.out.println("child ride fare: "+ child_ride_fare);
		
		double total_amount=adult_ride_fare+child_ride_fare;
		System.out.println("Total Amount: "+total_amount);
	}
	
	public static void bumperCars(int noOfAdults, int noOfChildren)
	{
		System.out.println("Total hrs of ride: "+ noOfHours);
		
		double adult_ride_fare=noOfAdults*noOfHours*45;
		System.out.println("adult ride fare: "+ adult_ride_fare);
		
		double child_ride_fare=noOfChildren*noOfHours*25;
		System.out.println("child ride fare: "+ child_ride_fare);
		
		double total_amount=adult_ride_fare+child_ride_fare;
		System.out.println("Total Amount: "+total_amount);
	}
	
	public static void baloonRace(int noOfAdults, int noOfChildren)
	{
		System.out.println("Total hrs of ride: "+ noOfHours);
		
		double adult_ride_fare=noOfAdults*noOfHours*70;
		System.out.println("adult ride fare: "+ adult_ride_fare);
		
		double child_ride_fare=noOfChildren*noOfHours*60;
		System.out.println("child ride fare: "+ child_ride_fare);
		
		double total_amount=adult_ride_fare+child_ride_fare;
		System.out.println("Total Amount: "+total_amount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		boolean cont;
	 do
	  {  
		System.out.println("Select the Ride from the list: "+"\r\n"
					+"1. Alibaba"+"\r\n"+"2. Alpine slide"+"\r\n"
			     	+"3. Bumper Cars"+"\r\n"+"4. Baloon Race");
		int rideName=sc.nextInt();
		System.out.println("Enter No. of Hours: ");
		noOfHours=sc.nextInt();
		System.out.println("Enter No. of Adults: ");
		int noOfAdults=sc.nextInt();
		System.out.println("Enter No. of Children: ");
		int noOfChildren=sc.nextInt();
		
		switch(rideName)
		{
			case  1 : aliBaba(noOfAdults, noOfChildren);
						  break;   
			case  2 : alpineSlide(noOfAdults, noOfChildren);     
				 		  break;
			case  3 : bumperCars(noOfAdults, noOfChildren);
						  break; 
			case  4 : baloonRace(noOfAdults, noOfChildren);
			  			  break; 			 
			case  5 : System.exit(0);	  
			default:  System.out.println("Select Valid Ride");
		}
		System.out.println("Continue ? (true/false)");
	    cont=sc.nextBoolean();
	  }while(cont);
	}

}
