package com.cts.oop.test;

import com.cts.oop.Address;
import com.cts.oop.ContractEmployee;
import com.cts.oop.EmployeEmp;
import com.cts.oop.Employee;

public class EmployeeEmpTest {
	
	public static void main(String[] args) {
		EmployeEmp emp=new EmployeEmp(123,"dillu");//with parameterized constructor too u can display only with mandatory properties
		EmployeEmp	emp1=new EmployeEmp();
		
		
		//emp.setAddress("anna nagar");
		emp.setId(122);//with instance u can display the object
		System.out.println("id :"+emp.getId());
		emp.setName("dilshad");
		System.out.println("name :"+emp.getName());
		emp.setSalary(10000);
		emp1.setSalary(50000);
		System.out.println("salary"+emp.getSalary());
		emp.show(emp);
		emp1.display(emp1);
		
		ContractEmployee contract=new ContractEmployee(144,"dilshaqd",1233);
		contract.setDuration(767);
		contract.show(contract);
		
		
		Address address=new Address();
		address.setCity("Coimbatore");
		address.setPincode(654601);
		address.setStreet("4th cross anna nagar");
		emp1.show(address);
	}
      
      
}
