package com.cts.java;

public class Average {
	public String sum(int x,int y,int z) {
		int sum=x+y+z;
		
		if(sum>=95) {
			return "A";
		}
		if(sum>=80) {
			return "B";
		}
		if(sum>=60) {
			return"C" ;
					
}
	
		else {
		return "fail";
	}
}
}
