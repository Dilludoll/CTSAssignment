package com.cts.java;

//This is not calculating average
//You are getting grade based on 3 subject marks
//So class name should note be Average.
public class Average {
	public String getAverage(int x, int y , int z) { //USING ARRAYS
		
		String arr[]= {" ","FAil","B-","B","A-","A","A+","C","C-"};
		
		int avg=(x+y+z)/90;
		return arr[avg];
		
		//return arr[(x+y+z)/90];
		


		
		/*USING LADDER IF ELSE CONDITION
		
		if(avg>=90) {
			return "A+";
		}
		if(avg<90&& avg>=80) {
			return "A";
		}
		if(avg<80&& avg>=70) {
			return"A-" ;
		}
		if(avg<70 && avg>=60) {
			return "B+";
		}
		if(avg<60 &&avg>=50) {
			return "B-";
		}

	
		else {
		return "fail";
	}*/
	
}


	
}
