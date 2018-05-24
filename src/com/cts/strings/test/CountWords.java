package com.cts.strings.test;
import java.util.Scanner;
public class CountWords {
	public static int getWordCount(String x) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the word");
		 x=sc.nextLine();
		// int len=x.length();
		String[] strArray= x.trim().split(" ");
		System.out.println(+strArray);
		return 0;
		
	}

}
