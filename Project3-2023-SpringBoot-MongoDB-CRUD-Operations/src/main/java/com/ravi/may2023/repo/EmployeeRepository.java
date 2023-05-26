package com.ravi.may2023.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ravi.may2023.documents.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
      
	
}
