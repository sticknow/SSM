package com.hy.ssm.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hy.ssm.domain.AppUser;
import org.apache.ibatis.annotations.Param;


public interface BaseDao<T> {

    public T get(long id);                    //只查询一个，常用于修改

    public T findByUsername (String username);   //按username查询

    public void insert(T entity);                    //插入，用实体作为参数

    public void update(T entity);                    //修改，用实体作为参数

    public void deleteById(long id);        //按id删除，删除一条；支持整数型和字符串类型ID



}
