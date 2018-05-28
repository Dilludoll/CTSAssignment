package com.cts.arrays.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class MergeTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		int arr3[]=new int[10];
		System.out.println("eneter the five nos for frst array:");
		for(int i=0;i<5;i++) {
			arr1[i]=Integer.parseInt(br.readLine());
			
		}
		System.out.println("eneter the five nos for seecond array:");
		for(int i=0;i<5;i++) {
			arr2[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<5;i++) {
			arr3[i]=arr1[i];
			arr3[5+i]=arr2[i];
			
			
		}
		System.out.println("final array is:");
		for(int i=0;i<10;i++) {
			System.out.print(arr3[i]+ " ");
			
		}
	}
}