package com.cts.java;

public class LowerAngleTriangle {
public static void lowertri(int x) {
		
		for(int i=1;i<=x;i++) {
			for (int j=4;j>=i;j--) {
				
				System.out.print(+j);
			}
			System.out.println();
		}
		

}
}
