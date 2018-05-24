package com.cts.arrays.java;

public class BinarySearch {
	public  static int  binarySearch(int arr[],int frst,int last,int key) {
		
		
		
		 int mid=(frst+last)/2;
		 while(frst<=last) {
			 if(arr[mid]<key) {
				 frst=mid+1;
			 }
			 else if(arr[mid]==key) {
				 System.out.println( +mid);
				 break;
			 }
			 else {
				 last=mid-1;
				 
			 }
			 mid=frst+last/2;
		 }
		if(frst>last) {
			System.out.println("not found");;
		}
		return -1;
		
		
	}
}


