package com.ypc.springbootrediszhujie.service;

import com.ypc.springbootrediszhujie.po.Student;

import java.util.List;

/**
 * @author YPC
 * @create 2019 02 18 11:40
 */
public interface StudentService {
    public List<Student> findAll();
    public boolean delete(int id);
}
