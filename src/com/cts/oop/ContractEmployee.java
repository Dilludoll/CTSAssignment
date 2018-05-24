package com.cts.oop;


public  class ContractEmployee extends EmployeEmp{
	//class ContractEmployee extends EmployeEmp{
	


public int duration; 

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}
		
			
	
		public ContractEmployee(int id, String name, int duration) {
			super(id, name);
			this.duration = duration;
		}
}
		
