package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
