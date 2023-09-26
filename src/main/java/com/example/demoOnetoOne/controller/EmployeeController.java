package com.example.demoOnetoOne.controller;

import com.example.demoOnetoOne.entity.Employee;
import com.example.demoOnetoOne.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeController {
    //  create field to autowire
    private EmployeeService employeeService;

    //  autowire it
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    //  create api to find all employee
    @GetMapping("/employees")
    public List<Employee> findAllEmployee(){
        return employeeService.findAll();
    }

    //  create api to find employee by id
    @GetMapping("/employees/{employeeId}")
    public Employee findAllEmployee(@PathVariable int employeeId){


        return employeeService.findById(employeeId);
    }

    //  create api to save an employee
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee theEmployee){
        return employeeService.save(theEmployee);
    }

    //  create api to update an employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        return employeeService.save(theEmployee);
    }

    //  create api to find employee by id
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        System.out.println("soifdsjvlddlkv");
        return employeeService.deleteById(employeeId);
    }


}