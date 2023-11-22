package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}