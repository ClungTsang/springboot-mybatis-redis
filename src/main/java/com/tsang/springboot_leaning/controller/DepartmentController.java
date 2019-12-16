package com.tsang.springboot_leaning.controller;

import com.tsang.springboot_leaning.bean.Department;
import com.tsang.springboot_leaning.bean.Employee;
import com.tsang.springboot_leaning.mapper.DepartmentMapper;
import com.tsang.springboot_leaning.service.DepartmentService;
import com.tsang.springboot_leaning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @GetMapping("/sel")
    public Department selectById1(@RequestParam Integer id){
        Department department = departmentService.selectById(id);
        return department;
    }
    @GetMapping("/sel2}")
    public Department updateById(@RequestParam Integer id){
        Department department = departmentService.updateById(id);
        return department;
    }
}
