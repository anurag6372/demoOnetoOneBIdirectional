package com.example.demoOnetoOne.dao;

import com.example.demoOnetoOne.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails,Integer> {
}
