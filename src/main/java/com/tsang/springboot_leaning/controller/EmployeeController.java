package com.tsang.springboot_leaning.controller;

import com.tsang.springboot_leaning.bean.Employee;
import com.tsang.springboot_leaning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/sel")
    public Employee selectById1(@RequestParam Integer id){
        return employeeService.selectById(id);
    }
    @GetMapping("/sel2")
    public Employee updateById(@RequestParam Integer id){
        return employeeService.updateById(id);
    }
}
