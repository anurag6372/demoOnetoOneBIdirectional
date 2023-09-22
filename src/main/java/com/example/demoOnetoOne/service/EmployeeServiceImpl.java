package com.example.demoOnetoOne.service;

import com.example.demoOnetoOne.dao.EmployeeRepo;
import com.example.demoOnetoOne.entity.Employee;
import com.example.demoOnetoOne.entity.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> temp=employeeRepo.findById(id);
        if(temp.isEmpty()){
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return temp.get();
    }

    @Transactional
    @Override
    public String deleteById(int id) {
        Optional<Employee> temp=employeeRepo.findById(id);
        if(temp.isEmpty()){
            return "There is no Employee with id: "+id;
        }
        else {
            employeeRepo.deleteById(id);
            return "Successfully deleted Employee with id: "+id;
        }
    }
}
