package com.zxy.mybatis.sqlsession;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/11/23
 * @Modified By:
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     *
     * @return
     */
    SqlSession openSession();
}
