package com.cts.arrays.test;

import java.util.Arrays;

//import com.cts.arrays.java.DeletionOfArrays;

public class DeletionOfArraysTest {
	public static void main(String[] args) {
	int arr[]=new int[]{23,34,55};
	arr[2]=arr[arr.length-1]; ///giving the index position which i want to delete
	int a[]=new int[arr.length-1];
	for(int i=0;i<a.length;i++) {
		a[i]=arr[i];
	}
	System.out.println(Arrays.toString(a));
	
	
	
		}

}
