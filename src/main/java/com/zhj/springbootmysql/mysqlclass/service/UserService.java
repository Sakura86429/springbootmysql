package com.zhj.springbootmysql.mysqlclass.service;

import com.zhj.springbootmysql.mysqlclass.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/7/23 21:28
 */
@Service
public interface UserService {

    List<User> getUserList();

    String AddUser(User user);
}
