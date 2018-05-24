package com.cts.strings.test;
import java.util.Scanner;
public class LowerCaseCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit_count=0;
		int lo_count=0;
		System.out.println("enter word");
		String wrd=sc.nextLine();
		
		int len=wrd.length();
		for(int i=0;i<len;i++) {
			if(Character.isLowerCase((wrd.charAt(i)))) {
				lo_count++;
			}
			
		
		}
		System.out.println("lo case:"+lo_count++);
		
		}
	}
	
