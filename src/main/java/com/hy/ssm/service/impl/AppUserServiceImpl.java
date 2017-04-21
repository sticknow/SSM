package com.hy.ssm.service.impl;


import com.hy.ssm.dao.AppUserDao;
import com.hy.ssm.domain.AppUser;
import com.hy.ssm.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


@Service(value = "appUserService")
public class AppUserServiceImpl implements AppUserService {
   @Autowired
    private AppUserDao appUserDao;



    @Transactional
    public AppUser get(long id) {
        return appUserDao.get(id);
    }

    @Transactional
    public AppUser findByUsername(String username) {
        return appUserDao.findByUsername(username);
    }

    @Override
    public void insert(AppUser entity) {

    }

    @Override
    public void update(AppUser entity) {

    }

    @Override
    public void deleteById(long id) {

    }
}
