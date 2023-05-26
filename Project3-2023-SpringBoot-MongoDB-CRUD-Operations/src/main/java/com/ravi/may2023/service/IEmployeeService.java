package com.ravi.may2023.service;

import java.util.List;

import com.ravi.may2023.documents.Employee;

public interface IEmployeeService {

	  public void saveEmployee(Employee employee);
	  public List<Employee> getAllEmployees();
	  public void updateEmployee(Employee employee);
	  public void deleteEmployee(String employeeId);
	
}
