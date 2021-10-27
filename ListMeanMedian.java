package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;

public class ListMeanMedian {
	
	public static void sum(ArrayList<Integer> list)
	{
		 int sum = 0;
		    for (int i: list)
		        sum += i;
		 System.out.println("Sum: "+sum);   
	}
	public static void mean(ArrayList<Integer> list)
	{
		int sum = 0;
	    for (int i: list)
	        sum += i;
	    int mean=sum/list.size();
	    System.out.println("Mean: "+mean); 
	}
	public static void median(ArrayList<Integer> list)
	{
		double m=0;
		Collections.sort(list);
		int n=list.size();
		if(n%2==1)
		{
			m=list.get((n+1)/2-1);
			//m=a[(n+1)/2-1];
		}
		else
		{
			m=(list.get(n/2-1)+list.get(n/2))/2;
			//m=(a[n/2-1]+a[n/2])/2;
		}
		System.out.println("median: "+m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> as=new ArrayList<>();
		as.add(1);
		as.add(3);
		as.add(2);
		as.add(5);
		as.add(4);
		
		ListMeanMedian.sum(as);
		ListMeanMedian.mean(as);
		ListMeanMedian.median(as);
		
	}

}
