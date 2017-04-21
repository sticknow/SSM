package com.hy.ssm.service;


import com.hy.ssm.domain.AppUser;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * Created by LynAs on 20-Mar-16
 */
public interface AppUserService {
    public AppUser get(long id);                    //只查询一个，常用于修改

    public AppUser findByUsername (String username);   //按username查询

    public void insert(AppUser entity);                    //插入，用实体作为参数

    public void update(AppUser entity);                    //修改，用实体作为参数

    public void deleteById(long id);        //按id删除，删除一条；支持整数型和字符串类型ID





}
