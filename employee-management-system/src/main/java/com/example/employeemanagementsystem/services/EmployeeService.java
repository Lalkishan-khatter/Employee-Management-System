package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.model.EmployeeInfo;
import com.example.employeemanagementsystem.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static final Logger logger =
            LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeInfo> getEmployees() {

        logger.info("Getting the list of employee");

        List<EmployeeInfo> listEmployies = employeeRepository.findAll();
        return listEmployies;
    }

    public void create(EmployeeInfo employeeInfo) {

        logger.info("Creating the employee");

        employeeRepository.save(employeeInfo);
    }


    public EmployeeInfo findEmployeeById(Long id) {

        logger.info("Getting employee by id: " + id);

        EmployeeInfo employee = employeeRepository.getOne(id);
        return employee;
    }

    public void removeEmployee(EmployeeInfo employeeInfo) {

        logger.info("Deleting the employee of id : " + employeeInfo.getEmployeeId());
        employeeRepository.delete(employeeInfo);
    }
}