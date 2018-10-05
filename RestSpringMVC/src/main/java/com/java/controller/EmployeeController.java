/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.controller;

import com.java.model.EmployeeModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author s6608360
 */
@RestController
public class EmployeeController {
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    //@ResponseBody
    public List<EmployeeModel> getAllEmployees(){
        return employees();
    }
  
    @RequestMapping(value = "/getEmployeeById/{id}", method = RequestMethod.GET)
   // @ResponseBody
    public EmployeeModel getById(@PathVariable("id") int id){
        List<EmployeeModel> emps = employees();
        for(EmployeeModel emp : emps){
            if(emp.getEmployeeId() == id)
                return emp;
        }
        return null;
    }
    
    
    public List<EmployeeModel> employees(){
        EmployeeModel emp = new EmployeeModel(1, "Juanaga", "Cuerna", "dev");
        EmployeeModel emp2 = new EmployeeModel(2, "Mau", "Lejos", "dev");   
        EmployeeModel emp3 = new EmployeeModel(3, "Fer", "Rosario", "dev");
        EmployeeModel emp4 = new EmployeeModel(4, "Luis", "Cuautitlan", "Diseñador");
        EmployeeModel emp5 = new EmployeeModel(5, "Mike", "Atizapan", "Tester");
        List<EmployeeModel> emps = new ArrayList<>();
        emps.add(emp);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);
        return emps;
    }
}
