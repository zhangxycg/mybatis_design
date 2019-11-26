package com.zxy.test;

import com.zxy.dao.IUserDao;
import com.zxy.mybatis.io.Resources;
import com.zxy.mybatis.sqlsession.SqlSession;
import com.zxy.mybatis.sqlsession.SqlSessionFactory;
import com.zxy.mybatis.sqlsession.SqlSessionFactoryBuilder;
import com.zxy.pojo.User;


import java.io.InputStream;
import java.util.List;

/**
 * @Description: mybatis 测试类
 * @Author: zhangxy
 * @Date: Created in 2019/11/22
 * @Modified By:
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        // 1.读取配置文件
        InputStream input = Resources.getResourceAsStream("Mybatis-configs.xml");
        // 2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 使用构建者模式，把对象的创建信息隐藏，使得调用方法的时候就可拿到对象
        SqlSessionFactory factory = builder.build(input);
        // 3.使用工厂创建SqlSession对象(借助此对象与数据库交互)
        // 使用工厂模式，解耦（降低类之间的依赖关系）
        SqlSession session = factory.openSession();
        // 4.使用SqlSession对象创建dao接口的代理对象
        // 使用代理模式，不修改源码的基础上对方法进行增强
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5.使用代理对象执行dao接口中的方法
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        // 6.释放资源
        session.close();
        input.close();
    }
}
