package com.ravi.may2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.may2023.documents.Employee;
import com.ravi.may2023.serviceImpl.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@Operation(summary = "Save Employee", description = "Curd Operations on MongoDb and Spring Boot - SaveEmployee Event")
	@RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json")
	//@PostMapping(value = "/employee")
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee) {

		employeeService.saveEmployee(employee);
		return new ResponseEntity<Object>("Successfully Saved", HttpStatus.OK);
	}

	@Operation(summary = "getAllEmployeesAPI", description = "Curd Operations on MongoDb and Spring Boot")
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getAllEmployees() {

		List<Employee> empList = null;
		empList = employeeService.getAllEmployees();
		return new ResponseEntity<Object>(empList, HttpStatus.OK);
	}

	@Operation(summary = "updateEmployeeAPI", description = "Curd Operations on MongoDb and Spring Boot")
	@RequestMapping(value = "/employee", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee empinput) {

		employeeService.updateEmployee(empinput);
		return new ResponseEntity<Object>("Update Employee Successfully", HttpStatus.OK);
	}

	@Operation(summary = "deleteEmployeeAPI", description = "Curd Operations on MongoDb and Spring Boot")
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Object> deleteEmployee(@PathVariable String id) {

		employeeService.deleteEmployee(id);
		return new ResponseEntity<Object>("Deleted Employee Successfully", HttpStatus.OK);
	}

}
