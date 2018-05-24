package com.cts.java;

public class Palindrome {
	public int isPalindrome(int n) {
		int r;
	
		int sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
if(temp==sum) {

	return temp;
}
else {
	return 0;
}
	}
}


