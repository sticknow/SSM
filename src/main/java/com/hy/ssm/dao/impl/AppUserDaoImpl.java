package com.hy.ssm.dao.impl;

import com.hy.ssm.dao.AppUserDao;
import com.hy.ssm.domain.AppUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by msq on 2017/4/21.
 */
@Repository
public class AppUserDaoImpl extends BaseDaoImpl<AppUser> implements AppUserDao {
    public AppUserDaoImpl() {
        super.setNs("mapper.AppUserMapper");
    }
}
