package com.tsang.springboot_leaning;

import com.tsang.springboot_leaning.bean.Employee;
import com.tsang.springboot_leaning.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLeaningApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate; //操作k-v都是字符串的

    @Autowired
    RedisTemplate redisTemplate;    //操作k-v都是对象的

    @Autowired
    RedisTemplate<Object, Employee> empRedisTemplate;

    @Test
    public void selectEmpById(){
        Employee employee = employeeMapper.selectById(1);
        System.out.println(employee);
    }
    @Test
    public void test01(){
        //给redis保存数据
//        stringRedisTemplate.opsForValue().append("msg","hello");
        //从redis中读取数据
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);
        //给redis保存集合
//        stringRedisTemplate.opsForList().leftPush("list01","001");
//        stringRedisTemplate.opsForList().leftPush("list01","002");
    }
    @Test
    public void test02(){
        Employee employee = employeeMapper.selectById(2);
//        redisTemplate.opsForValue().set("emp01",employee);
        empRedisTemplate.opsForValue().set("emp02",employee);
    }
}
