package com.cts.java.test;

import com.cts.java.Add;

public class AddTest {
	
	public static void main(String[] args) {
		Add a = new Add();
		
	 System.out.println(a.add(10, 20));
	 
System.out.println(	 a.add(       a.add(10, 20) ,    30));
System.out.println(  a.add(  a.add(10, 20) , a.add(30, 40)));
	}

}
