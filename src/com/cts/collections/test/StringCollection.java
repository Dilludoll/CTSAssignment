package com.cts.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cts.oop.EmployeEmp;
import com.cts.oop.test.EmployeeEmpTest;

public class StringCollection {
public void displayListUsingEnhancedForLoop(List list) {
	for(Object obj:list) {
		System.out.println(obj);
	}
		
	}
public <E> void displayListUsingIterator(List list) {
	Iterator it=list.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
public static void main(String[] args) {
	StringCollection cts=new StringCollection();
	List <String>stringList=new ArrayList <String>();
	stringList.add("dillu");
	stringList.add("dil");
	stringList.add("dilll");
	cts.displayListUsingEnhancedForLoop(stringList);
	
	
}
}

		
	
	








