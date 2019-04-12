package com.ypc.springbootrediszhujie.service;

import com.ypc.springbootrediszhujie.dao.StudentDao;
import com.ypc.springbootrediszhujie.po.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YPC
 * @create 2019 02 18 11:41
 */
@Service
@CacheConfig(cacheNames = "demozhujie")//标注此类作为操作缓存
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao sd;
    @Override
    @Cacheable//会先从缓存中读取数据，如果缓存中存在，那么这个注解标注的方法就不执行
    public List<Student> findAll() {
        System.out.println("从数据库中读取数据");
        return sd.findAll();
    }

    @Override
    @CacheEvict(allEntries = true)
    public boolean delete(int id) {
        if (sd.delete(id)>0){
            return true;
        }
        return false;
    }

}
