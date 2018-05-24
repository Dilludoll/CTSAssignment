package com.cts.arrays.java;

public class Merge {
	public int getMerge(int[] a1,int[] a2) {
		int []merge=new int[a1.length+a2.length];
		int counter=0;
		for(int i=0;i<a1.length;i++) {
			merge[i]=a1[i];
			//why count??
			counter++;
			
		}
	for(int j=0;j<a2.length;j++) {
		merge[counter++]=a2[j];
	
	}
	for(int i=0;i<merge.length;i++) {
		//why SOP
		System.out.println( +merge[i]);
		
	}
		//why return counter?
	return counter;
	
	
	}

}
