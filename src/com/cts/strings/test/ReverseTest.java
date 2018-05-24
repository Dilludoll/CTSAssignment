package com.cts.strings.test;
import java.util.Scanner;

import com.cts.strings.Reverse;
public class ReverseTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words");
		 String original=sc.nextLine();
		//String original;
		String reverse="";
		int len=original.length();
		for(int i=len-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
System.out.println("ori is: " +original);
 System.out.println("rev is " +reverse);
 
		
		
	}
}
