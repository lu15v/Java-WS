/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

/**
 *
 * @author s6608360
 */
public class EmployeeModel {
    private int employeeId;
    private String employeeName;
    private String address;
    private String designation;

    public EmployeeModel(int employeeId, String employeeName, String address, String designation) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.designation = designation;
    }

    
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
