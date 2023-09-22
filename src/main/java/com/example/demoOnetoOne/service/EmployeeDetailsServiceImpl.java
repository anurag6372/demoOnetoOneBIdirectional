package com.example.demoOnetoOne.service;

import com.example.demoOnetoOne.dao.EmployeeDetailsRepo;
import com.example.demoOnetoOne.entity.Employee;
import com.example.demoOnetoOne.entity.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService{
    private EmployeeDetailsRepo employeeDetailsRepo;

    @Autowired
    public EmployeeDetailsServiceImpl(EmployeeDetailsRepo employeeDetailsRepo) {
        this.employeeDetailsRepo = employeeDetailsRepo;
    }

    @Override
    public EmployeeDetails save(EmployeeDetails employeeDetails) {
        return employeeDetailsRepo.save(employeeDetails);
    }

    @Override
    public List<EmployeeDetails> findAll() {
        return employeeDetailsRepo.findAll();
    }

    @Override
    public EmployeeDetails findById(int id) {
        Optional<EmployeeDetails> temp=employeeDetailsRepo.findById(id);
        if(temp.isEmpty()){
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return temp.get();
    }

    @Override
    public String deleteById(int id) {
        Optional<EmployeeDetails> temp=employeeDetailsRepo.findById(id);
        if(temp.isEmpty()){
            return "There is no Employee with id: "+id;
        }
        else {
            employeeDetailsRepo.deleteById(id);
            return "Successfully deleted Employee with id: "+id;
        }
    }
}
