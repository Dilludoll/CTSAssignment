package com.cts.java;

//This is not calculating average
//You are getting grade based on 3 subject marks
//So class name should note be Average.
public class Average {
	public String sum(int x,int y,int z) {
		int sum=x+y+z;
		//From where you got this coniditon?  In the assignment document it is not present.
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
