package com.zhj.springbootmysql.mysqlclass.controller;

import com.zhj.springbootmysql.mysqlclass.pojo.User;
import com.zhj.springbootmysql.mysqlclass.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/7/23 21:19
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // 查询数据
    @RequestMapping("/getuserlist")
    public List<User> getUserList()
    {
//        return "获取成功！";
        return userService.getUserList();
    }

    // 插入数据
//    @PostMapping("/adduser")
//    @GetMapping("/adduser")
//    @RequestMapping(value = "/adduser",method = {RequestMethod.POST})
    @RequestMapping("/adduser")
    public String addUser(User user)
    {
        return userService.AddUser(user);
//        return "获取成功！";
    }

}