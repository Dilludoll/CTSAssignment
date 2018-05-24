package com.cts.arrays.java;

public class DeletionOfArrays{
 
	public int deletion(int[] arr,int n) {
		int location= 0;
		int max= 4;
		for(int i=0;i<=max;i++) {
			arr[i]=n;
		}
		
		for(int i=0;i<max;i++) {
			return +arr[i];
		}
		location=n;
		
 for(int i=location;i<max;i++) {
	 arr[i]=arr[i+1];
 }
 
		
 for(int i=0;i<max;i++) {
	 return arr[i]; 
	 }
 return location;
	}
}
	
 


