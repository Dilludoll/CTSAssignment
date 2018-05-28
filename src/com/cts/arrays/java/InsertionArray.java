package com.cts.arrays.java;

//incomplete

public class InsertionArray {
	int count=0;
	
	public void inserAtPosition(int a[],int pos,int val) {
		for(int i=count-1;i>pos;i--) {
			a[i]=a[i-1];
		}
		a[pos]=val;
	}
	public void insert(int a[],int val) {
		
		
		a[count++]=val;
		
		
	}

	
public void insertAtStart(int a[],int val){
	for(int i=count-1;i>0;i--) {
		a[i]=a[i-1];
	}
	a[0]=val;	
	}
public void print(int a[]) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[j]+ " ");
	}
	System.out.println();
}
}
