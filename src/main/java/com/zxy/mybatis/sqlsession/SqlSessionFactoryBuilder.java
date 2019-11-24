package com.zxy.mybatis.sqlsession;

import com.zxy.mybatis.cfg.Configuration;
import com.zxy.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.zxy.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @Description: 用于创建一个SqlSessionFactory对象
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     *
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
