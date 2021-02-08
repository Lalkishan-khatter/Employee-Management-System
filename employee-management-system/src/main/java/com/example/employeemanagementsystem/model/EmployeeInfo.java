package com.example.employeemanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "mst_emp")
public class EmployeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long employeeId;

    @Column(name = "emp_name", columnDefinition = "VARCHAR(200)")
    private String employeeName;

    @Column(name = "emp_phone_no", columnDefinition = "VARCHAR(200)")
    private String employeePhoneNumber;

    @Column(name = "emp_department", columnDefinition = "VARCHAR(200)")
    private String employeeDepartment;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id", referencedColumnName = "adr_id")
    private Address address;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}