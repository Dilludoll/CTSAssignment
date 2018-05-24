package com.cts.java;

public class SummingIndividuals {
	public int add(int n) {
		int r;
		int sum=0;
		
		while(n>0) {
			 
			r=n%10;
			n=n/10;
		  sum =sum+r;
		}
		
		return sum;
		
		
	}
	//if(sum>9 && n=0) {
		//n=sum;
		//sum=0;
	
		
	
	
	
		
}


