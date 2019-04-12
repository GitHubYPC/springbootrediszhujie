package com.ypc.springbootrediszhujie.dao;

import com.ypc.springbootrediszhujie.po.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YPC
 * @create 2019 02 18 11:38
 */
@Mapper
@Repository
public interface StudentDao {
    @Select("select * from student")
    @Results(id = "stu",value = {
            @Result(property = "id",column = "stuid"),
            @Result(property = "name",column = "stuname")
    })
    public List<Student> findAll();
    @Delete("delete from student where stuid=#{id}")
    public int delete(int id);
}
