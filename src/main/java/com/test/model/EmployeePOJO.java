package com.test.model;

public class EmployeePOJO {
	
	private int employeeId;
	private String employeeName;
	private String  address;
	
	public EmployeePOJO() {
		super();
	}
	
	

	public EmployeePOJO(int employeeId, String employeeName, String address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}



	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}



	public String getAddress() {
		return address;
	}

}
