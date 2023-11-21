package com.learning.EmployeeSystemAPI.Repositories;

import com.learning.EmployeeSystemAPI.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
