package com.cts.java;

public class Palindrome {
	//this method should return true false.
	public boolean isPalindrome(int n) {
		int r;
	
		int sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
if(temp==sum) {

	return true;
}
else {
	return false;
}
	}
}


