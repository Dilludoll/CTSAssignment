package com.cts.arrays.test;

import java.util.Arrays;

import com.cts.arrays.java.BinarySearch;

public class BinarySearchTest {
	public static void main(String[] args) {
		
		int  arr[]= {40,50,80,90,100};
		int key=90;
		int last=arr.length-1;
		int res=Arrays.binarySearch(arr, key);
		if(res<0) {
			System.out.println("not found");
			
		}
		else {
			System.out.println("found"+res);
		}
				}

}
