package com.cts.oop.test;

import com.cts.oop.Employee;

public class EmployeeTest {

	public  static void display(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
	public static void main(String[] args) {
	Employee emp=new Employee(122, "dillu");
	emp.setId(121);
	emp.setName("dilshad");
	emp.setSalary(20000);                                                                                                 
	
} 
}
