package com.inheritance.java;

public class Italian extends Restaurant {
	public void servesPasta()
	{
		System.out.println("Serves Pasta from Italian class");
	}
	
	public void useIngredients()
	{
		System.out.println("Ingredients of Italian Class called using Restaurant");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chinese c=new Chinese();
		Mexican m=new Mexican();
		Italian i=new Italian();
		
		Restaurant r=new Italian();
		
		c.servesNoodles();
		m.servesnNachosAndPotatoes();
		i.servesPasta();
		r.useIngredients();
		
		
	}
}
