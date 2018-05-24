package com.cts.strings.test;
import java.util.Scanner;

public class WordPalindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the word");
	String original=sc.nextLine();
	String reverse="";
	int len=original.length();
	for(int i=len-1;i>=0;i--) {
		reverse=reverse+original.charAt(i);
	}
	if(original.equalsIgnoreCase(reverse)) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("not a palidrome ");
	}
	}

}
