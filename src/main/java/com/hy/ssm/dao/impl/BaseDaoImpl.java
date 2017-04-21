
package com.hy.ssm.dao.impl;



import com.hy.ssm.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    private String ns;        //命名空间(namespace )

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }


    public T get(long id) {
        return this.getSqlSession().selectOne(ns + ".get", id);
    }

    public T findByUsername(String username){
        return this.getSqlSession().selectOne(ns + ".findByUsername", username);
    }

    public void insert(T entity) {
        this.getSqlSession().insert(ns + ".insert", entity);
    }

    public void update(T entity) {
        this.getSqlSession().update(ns + ".update", entity);
    }

    public void deleteById(long id) {

        this.getSqlSession().delete(ns + ".deleteById", id);
    }


}
