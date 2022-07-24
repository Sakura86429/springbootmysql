package com.zhj.springbootmysql.mysqlclass.service.impl;

import com.zhj.springbootmysql.mysqlclass.mapper.UserMapper;
import com.zhj.springbootmysql.mysqlclass.pojo.User;
import com.zhj.springbootmysql.mysqlclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/7/23 21:29
 */
@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {

        try {
            List<User> users = userMapper.getUserList();

            return  users;
        }
        catch (Exception e)
        {
            throw e;
//            return null;
        }
    }

    @Override
    public String AddUser(User user) {
        try {

            int i = userMapper.AddUser(user);
            return "添加成功" + i + "条数据";
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
