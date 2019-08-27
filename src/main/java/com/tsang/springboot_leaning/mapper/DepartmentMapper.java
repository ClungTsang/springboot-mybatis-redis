package com.tsang.springboot_leaning.mapper;

import com.tsang.springboot_leaning.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department selectById(Integer id);

    @Update("update department set department_name=#{departmentName} where id = #{id}")
    public void updateEmp(Department department);

    @Delete("delete from department where id =#{id}")
    public void deleteEmpById(Integer id);

    @Insert("insert into department(id,departmentName) values(#{id},#{department_name})")
    public void insertEmployee(Department department);
}
