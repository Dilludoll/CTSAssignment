package com.cts.strings.test;
import java.util.Scanner;
public class CharacterCount {
	public static void main(String[] args) {
		int count=0;;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word");
		String str=sc.nextLine();
		char[]ch=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(j<i && ch[i]==ch[j]) {
					break;
				}
				if(ch[i]==ch[j]) {
					count++;
				}
				if(j==len-1) {
					System.out.println("the char "+ch[i]+ " is appears"+count+"times");
				}
			}
			
		}
		
		
	}

}
