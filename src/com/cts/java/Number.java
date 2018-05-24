package com.cts.java;

public class Number {
	
	public int big(int x, int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

	
	public   String    getGrade(int s1, int s2, int s3)
	{
		int avg = (s1+s2+s3)/3;
		
		if(avg>=90)
			return "A+";
		
		if(avg>=80)
			return "A";
		
		if(avg>=70)
			return "A-";
		
		if(avg>=60)
			return "B";
		
		
		return "FAIL";
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
