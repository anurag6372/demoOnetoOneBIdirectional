package com.example.demoOnetoOne.service;

import com.example.demoOnetoOne.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    String deleteById(int id);
}
