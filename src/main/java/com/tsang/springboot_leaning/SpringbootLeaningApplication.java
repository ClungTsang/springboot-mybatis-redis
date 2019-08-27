package com.tsang.springboot_leaning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
@MapperScan("com.tsang.springboot_leaning.mapper")
@EnableCaching
public class SpringbootLeaningApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootLeaningApplication.class, args);
    }



}
