package com.hy.ssm.dao;

import com.hy.ssm.domain.AppUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by msq on 2017/4/20.
 */

public interface AppUserDao extends BaseDao<AppUser>  {

}
