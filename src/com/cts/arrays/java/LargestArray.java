package com.cts.arrays.java;

public class LargestArray {
	
	//what this method is doig?
	//what is total?
		public  int getLargest(int[]a,int total){
		int temp;
		for(int i=0;i<total;i++){
			for(int j=i+1;j<total;j++) {
		if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
			}
		}
		


		return a[total-1];
		
		}

}
