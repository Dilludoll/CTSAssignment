package com.cts.java;

public class LowerAngleTriangle {
public static void lowertri(int x) {
		
		for(int i=1;i<=x;i++) {
			//why j=4??
			for (int j=6;j>=i;j--) {
				
				System.out.print(+j);
			}
			System.out.println();
		}
		

}
}
