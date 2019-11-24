package com.zxy.mybatis.sqlsession.defaults;

import com.zxy.mybatis.cfg.Configuration;
import com.zxy.mybatis.sqlsession.SqlSession;
import com.zxy.mybatis.sqlsession.SqlSessionFactory;

/**
 * @Description: SqlSessionFactory 接口的实现类
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的连接
     *
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
