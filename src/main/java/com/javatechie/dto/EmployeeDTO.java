package com.javatechie.dto;

import lombok.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import static org.springframework.data.web.config.EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO;

//@EnableSpringDataWebSupport(pageSerializationMode = VIA_DTO)
public class EmployeeDTO {
    private Integer id;
    private String userName;
    private String designation;
    private String firstName;
    private String lastName;
    private String fullName;
    private String employeeCode;
    private String region;
    private double phone;
    private String email;
    private String department;
    private double salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer id, String userName, String designation, String firstName, String lastName, String fullName, String employeeCode, String region, double phone, String email, String department, double salary) {
        this.id = id;
        this.userName = userName;
        this.designation = designation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.employeeCode = employeeCode;
        this.region = region;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}