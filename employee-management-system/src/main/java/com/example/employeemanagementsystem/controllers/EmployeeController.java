package com.example.employeemanagementsystem.controllers;

import com.example.employeemanagementsystem.model.EmployeeInfo;
import com.example.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public String listEmployee(Model model) {
        List<EmployeeInfo> listEmployies = employeeService.getEmployees();
        model.addAttribute("listEmployies", listEmployies);
        return "login";
    }

    @GetMapping("/AddEmployee")
    public String addEmployeeForm(Model model) {

        model.addAttribute("employee", new EmployeeInfo());

        return "addemployee";
    }

    @PostMapping("/process_register")
    public String processRegister(EmployeeInfo employeeInfo) {

        employeeService.create(employeeInfo);

        return "added_success";
    }

    @GetMapping("/editemp/{id}")
    public String editEmployeeForm(@PathVariable("id") Long id, Model model) {

        model.addAttribute("editemp", employeeService.findEmployeeById(id));

        return "editemployee";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") long id,
                                 EmployeeInfo employeeInfo,
                                 BindingResult result, Model model) {

        if (result.hasErrors()) {
            employeeInfo.setEmployeeId(id);
            return "editemployee";
        }

        EmployeeInfo emp = employeeService.findEmployeeById(id);

        emp.setEmployeeName(employeeInfo.getEmployeeName());
        emp.getAddress().getCityId().setCityName(employeeInfo.getAddress().getCityId().getCityName());
        emp.getAddress().getStateId().setStateName(employeeInfo.getAddress().getStateId().getStateName());
        employeeService.create(emp);
        return "updated_success";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id, Model model) {
        EmployeeInfo employeeInfo = employeeService.findEmployeeById(id);
        employeeService.removeEmployee(employeeInfo);
        return "deleted_success";
    }

    @GetMapping("/logout-success")
    public String logOut() {
        return "logout";
    }
}