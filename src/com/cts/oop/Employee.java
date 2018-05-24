package com.cts.oop;

public class Employee {
	private int id;
	private String name;
	private  int Salary;
	public Employee(int id, String name) {
		this.id=id;
		this .name=name;
	}
	

public int getId() {
return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	//private char gender;
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
	if( salary<10_000 ||salary >1_00_000) {
		System.out.println("Invalid salary"+"setting salary i.e.,10,000");
		return;
	}
}




}


