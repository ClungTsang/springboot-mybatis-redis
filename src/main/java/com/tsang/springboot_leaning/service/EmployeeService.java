package com.tsang.springboot_leaning.service;

import com.tsang.springboot_leaning.bean.Employee;
import com.tsang.springboot_leaning.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存 以后要相同的数据 直接从缓存中获取 不再调用方法
     *  cacheNames 缓存的名称，也就是在缓存中有一个叫emp的名字来标识不同的缓存组件。
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "emp",key = "#id")
    public Employee selectById(Integer id){
        return employeeMapper.selectById(id);
    }

    /**
     * 既调用方法，又更新缓存数据；同步更新缓存
     *  1、先调用方法
     *  2、再将目标方法的结果缓存起来
     * @param id
     * @return
     */
    @CachePut(cacheNames = "emp",key = "#id")
    public Employee updateById(Integer id){
        return  employeeMapper.selectById(id);
    }
}
