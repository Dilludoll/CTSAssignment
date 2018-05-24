package com.cts.java;

import java.util.Iterator;

public class LeftAngleTri {
	public int triangle(int n) {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
				
				for(int k=1;k<=i;k++) {
				System.out.print(+k);
					
				}
				System.out.println();
				
				
		}
		
		return n;
		
		
	
	

}
}

