package com.example.employeemanagementsystem.repositories;

import com.example.employeemanagementsystem.model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeInfo, Long> {
}