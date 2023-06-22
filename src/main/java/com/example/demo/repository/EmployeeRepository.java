package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    void deleteEmployeeById(String id);

    Optional<Employee> findEmployeeById(String id);
}
