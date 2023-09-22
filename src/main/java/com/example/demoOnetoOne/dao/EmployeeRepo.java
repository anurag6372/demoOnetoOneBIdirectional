package com.example.demoOnetoOne.dao;

import com.example.demoOnetoOne.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
