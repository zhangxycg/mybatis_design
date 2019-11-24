package com.zxy.mybatis.sqlsession.defaults;

import com.zxy.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Description: 用于创建数据源
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class DataSourceUtil {
    /**
     * 用来获取连接
     *
     * @param cfg
     * @return
     */
    public static Connection getConnection(Configuration cfg) {
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
