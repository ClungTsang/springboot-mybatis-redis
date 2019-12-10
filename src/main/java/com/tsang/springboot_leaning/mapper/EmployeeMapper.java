package com.tsang.springboot_leaning.mapper;

import com.tsang.springboot_leaning.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee selectById(Integer id);

    @Update("update employee set last_name=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id = #{id}")
    void updateEmp(Employee employee);

    @Delete("delete from employee where id =#{id}")
    void deleteEmpById(Integer id);

    @Insert("insert into employee(last_name,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    void insertEmployee(Employee employee);
}
