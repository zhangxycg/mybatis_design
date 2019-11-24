package com.zxy.dao;

import com.zxy.pojo.User;

import java.util.List;

/**
 * @Description: 用户持久层接口
 * @Author: zhangxy
 * @Date: Created in 2019/11/22
 * @Modified By:
 */
public interface IUserDao {
    /**
     * 查询所有信息
     *
     * @return
     */
//    @Select("select * from user")
    List<User> findAll();
}
