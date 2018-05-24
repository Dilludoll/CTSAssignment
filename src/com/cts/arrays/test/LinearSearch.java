package com.cts.arrays.test;

/**
 * @author Dillu Doll
 *
 */
public class LinearSearch {
	public static  int linearSearch(int[] arr,int key) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	

	
}
	
//public class LinearSearchTest{
	public static void main(String[] args ) {
		int a1[]= {23,45,87,90};
		int key=90;
		
		System.out.println("found at index" +linearSearch(a1,key));

		
	}
		
	
		
		
	}




