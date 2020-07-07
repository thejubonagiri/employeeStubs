package com.test.model;

import java.util.List;

public class EmployeeResponse {
	
	private List<EmployeePOJO> employeePojos;

	public List<EmployeePOJO> getEmployeePojos() {
		return employeePojos;
	}

	public void setEmployeePojos(List<EmployeePOJO> employees) {
		this.employeePojos = employees;
	}

	public EmployeeResponse() {
		super();
	}

	public EmployeeResponse(List<EmployeePOJO> employees) {
		super();
		this.employeePojos = employees;
	}
	
	

}
