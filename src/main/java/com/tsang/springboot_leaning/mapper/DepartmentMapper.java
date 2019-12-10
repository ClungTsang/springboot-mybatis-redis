package com.tsang.springboot_leaning.mapper;

import com.tsang.springboot_leaning.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department selectById(Integer id);

    @Update("update department set department_name=#{departmentName} where id = #{id}")
    void updateEmp(Department department);

    @Delete("delete from department where id =#{id}")
    void deleteEmpById(Integer id);

    @Insert("insert into department(id,departmentName) values(#{id},#{department_name})")
    void insertEmployee(Department department);
}
