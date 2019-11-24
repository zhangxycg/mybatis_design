package com.zxy.mybatis.sqlsession.defaults;

import com.zxy.mybatis.cfg.Mapper;
import com.zxy.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public class MapperProxy implements InvocationHandler {

    // map 的key是全限定类名加方法名
    private Map<String, Mapper> mappers;

    private Connection conn;

    public MapperProxy(Map<String, Mapper> mappers, Connection conn) {
        this.mappers = mappers;
        this.conn = conn;
    }

    /**
     * 用于对方法增强，调用select1List方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 1.获取方法名
        String methodName = method.getName();
        // 2.获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        // 3.组合key
        String key = className + "." + methodName;
        // 4.获取mappers中的mapper对象
        Mapper mapper = mappers.get(key);
        // 5.判断是否有mapper
        if (mapper == null) {
            throw new IllegalArgumentException("传入的参数有错误");
        }
        // 6.调用工具类查询所有
        return new Executor().selectList(mapper, conn);
    }
}
