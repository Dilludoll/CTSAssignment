package com.cts.oop;

public class EmployeEmp {
	
	public int id;
	public String name;
	private int salary;
	
	
	
		
	public EmployeEmp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public EmployeEmp() {
		
		
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
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public   void show(EmployeEmp emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		
	}
	public   void display(EmployeEmp emp1) {
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
	}
	
	public void show( ContractEmployee contract) {
	System.out.println(contract.getDuration());
	
	}
	public void show(Address address) {
		System.out.println(address.getCity());
		System.out.println(address.getStreet());
		System.out.println(address.getPincode());
	}
	}

	
	
	
	
