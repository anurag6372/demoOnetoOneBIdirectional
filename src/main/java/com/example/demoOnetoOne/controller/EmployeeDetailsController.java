package com.example.demoOnetoOne.controller;

import com.example.demoOnetoOne.entity.EmployeeDetails;
import com.example.demoOnetoOne.service.EmployeeDetailsService;
import com.example.demoOnetoOne.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeDetailsController {
    private EmployeeDetailsService employeeDetailsService;

    @Autowired
    public EmployeeDetailsController(EmployeeDetailsService employeeDetailsService) {
        this.employeeDetailsService = employeeDetailsService;
    }

    //  create api to find all employee
    @GetMapping("/employeesdetails")
    public List<EmployeeDetails> findAllEmployeeDetails(){
        return employeeDetailsService.findAll();
    }

    //  create api to find employee by id
    @GetMapping("/employeesdetails/{employeedetailsId}")
    public EmployeeDetails findAllEmployeeDetails(@PathVariable int employeedetailsId){


        return employeeDetailsService.findById(employeedetailsId);
    }

    //  create api to save an employee
    @PostMapping("/employeesdetails")
    public EmployeeDetails saveEmployeeDetails(@RequestBody EmployeeDetails theEmployeeDetails){
        return employeeDetailsService.save(theEmployeeDetails);
    }

    //  create api to update an employee
    @PutMapping("/employeesdetails")
    public EmployeeDetails updateEmployeeDetails(@RequestBody EmployeeDetails theEmployeeDetails){
        return employeeDetailsService.save(theEmployeeDetails);
    }

    //  create api to find employee by id
    @DeleteMapping("/employeesdetails/{employeedetailsId}")
    public String deleteEmployeeDetails(@PathVariable int employeedetailsId){

        return employeeDetailsService.deleteById(employeedetailsId);
    }

}
