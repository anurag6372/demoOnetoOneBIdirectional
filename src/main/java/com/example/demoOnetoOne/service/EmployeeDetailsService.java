package com.example.demoOnetoOne.service;

import com.example.demoOnetoOne.entity.Employee;
import com.example.demoOnetoOne.entity.EmployeeDetails;

import java.util.List;

public interface EmployeeDetailsService {
    EmployeeDetails save(EmployeeDetails employeeDetails);

    List<EmployeeDetails> findAll();

    EmployeeDetails findById(int id);

    String deleteById(int id);
}
