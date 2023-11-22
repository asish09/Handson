package com.example.demo.mapper;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getDepartment(),
                employee.getAddress()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getDepartment(),
                employeeDto.getAddress()
        );
    }
}