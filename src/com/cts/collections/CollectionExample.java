package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public void displayListUsingEnhancedForLoop(List list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		CollectionExample cs=new CollectionExample();
		List<Integer> integerList=new ArrayList<Integer>();
		
		integerList.add(54);
		integerList.add(25);
		integerList.add(100);
		integerList.add(106);
		System.out.println("befor3e soting");
		cs.displayListUsingEnhancedForLoop(integerList);
		Collections.sort(integerList);
		System.out.println("after soting");
		cs.displayListUsingEnhancedForLoop(integerList);
		
		
	}
}
	