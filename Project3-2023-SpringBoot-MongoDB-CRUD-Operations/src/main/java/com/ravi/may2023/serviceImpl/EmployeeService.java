package com.ravi.may2023.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.may2023.documents.Employee;
import com.ravi.may2023.repo.EmployeeRepository;
import com.ravi.may2023.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> empList = null;
		empList = employeeRepository.findAll();
		return empList;
	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
