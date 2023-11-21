package com.learning.EmployeeSystemAPI.Services;

import com.learning.EmployeeSystemAPI.Repositories.EmployeeRepository;
import com.learning.EmployeeSystemAPI.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
