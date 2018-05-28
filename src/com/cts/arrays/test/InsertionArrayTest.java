package com.cts.arrays.test;

import com.cts.arrays.java.InsertionArray;

public class InsertionArrayTest {
	
	public static void main(String[] args) {
		
		InsertionArray inr=new InsertionArray();
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			//a[i]=i;
			inr.insert(a, i+1);
		}
		
		inr.print(a);
		inr.inserAtPosition(a, 2, 32);
		inr.print(a);
		
		inr.insertAtStart(a , 34);
		inr.insertAtStart(a , 87);
		inr.print(a);
	}

}
