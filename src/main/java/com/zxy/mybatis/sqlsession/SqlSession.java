package com.zxy.mybatis.sqlsession;

/**
 * @Description: 自定义mybatis中和数据库交互的核心类，它里面可以创建dao接口的代理对象
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     *
     * @param daoInterfaceClass dao接口的字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
