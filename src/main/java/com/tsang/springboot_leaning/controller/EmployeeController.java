package com.tsang.springboot_leaning.controller;

import com.tsang.springboot_leaning.bean.Employee;
import com.tsang.springboot_leaning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/sel/{id}")
    public Employee selectById1(@PathVariable Integer id){
        Employee employee = employeeService.selectById(id);
        return employee;
    }
    @GetMapping("/emp/sel2/{id}")
    public Employee updateById(@PathVariable Integer id){
        Employee employee = employeeService.updateById(id);
        return employee;
    }
}
