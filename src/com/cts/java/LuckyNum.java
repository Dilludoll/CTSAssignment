package com.cts.java;

public class LuckyNum {
	public int isLucky(int n) {
		int r;
		int sum=0;
		
		while(n>0) {
			 
			r=n%10;
			n=n/10;
		  sum =sum+r;
		  if(sum>9 && n==0) {
				 
				n=sum;
				sum=0;
				
				
		}
		}
		
		
		
		
	
	 return sum; 
}
	
	
}