package com.ypc.springbootrediszhujie.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YPC
 * @create 2019 02 18 11:37
 */
@Data
//Serializable 序列化
public class Student implements Serializable {
    private int id;
    private String name;
}
